package com.pearlstudios.nasir.notes;

import android.content.Intent;
import android.graphics.Typeface;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Random;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Random;

public class NewTaskAct extends AppCompatActivity {

    TextView titlepage, addtitle, adddesc, adddate;
    EditText titledoes, descdoes, datedoes;
    Button btnSaveTask, btnCancel;
    DatabaseReference reference;
    Integer doesNum = new Random().nextInt();
    String keydoes = Integer.toString(doesNum);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);

        titlepage = findViewById(R.id.titlepage);

        addtitle = findViewById(R.id.addtitle);
        adddesc = findViewById(R.id.adddesc);
        adddate = findViewById(R.id.adddate);

        titledoes = findViewById(R.id.titledoes);
        descdoes = findViewById(R.id.descdoes);
        datedoes = findViewById(R.id.datedoes);

        btnSaveTask = findViewById(R.id.btnSaveTask);
        btnCancel = findViewById(R.id.btnCancel);

        btnSaveTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // insert data to database
                reference = FirebaseDatabase.getInstance().getReference().child("DoesApp").
                        child("Does" + doesNum);
                reference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        dataSnapshot.getRef().child("titledoes").setValue(titledoes.getText().toString());
                        dataSnapshot.getRef().child("descdoes").setValue(descdoes.getText().toString());
                        dataSnapshot.getRef().child("datedoes").setValue(datedoes.getText().toString());
                        dataSnapshot.getRef().child("keydoes").setValue(keydoes);

                        Intent a = new Intent(NewTaskAct.this,MainActivity.class);
                        startActivity(a);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });


        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(NewTaskAct.this,MainActivity.class);
                startActivity(a);
            }
        });

        // import font
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/ML.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MM.ttf");

        // customize font
        titlepage.setTypeface(MMedium);

        addtitle.setTypeface(MLight);
        titledoes.setTypeface(MMedium);

        adddesc.setTypeface(MLight);
        descdoes.setTypeface(MMedium);

        adddate.setTypeface(MLight);
        datedoes.setTypeface(MMedium);

        btnSaveTask.setTypeface(MMedium);
        btnCancel.setTypeface(MLight);

    }
}

//public class NewTaskAct extends AppCompatActivity {
//
//    TextView titlepage, addtitle, adddesc, adddate;
//    EditText titledoes, descdoes, datedoes;
//    Button btnSaveTask, btnCancel;
//
//    DatabaseReference reference;
//    Integer doesNum = new Random().nextInt();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_new_task);
//
//        titlepage = findViewById(R.id.titlepage);
//
//        addtitle = findViewById(R.id.addtitle);
//        adddesc = findViewById(R.id.adddesc);
//        adddate = findViewById(R.id.adddate);
//
//        titledoes = findViewById(R.id.titledoes);
//        descdoes = findViewById(R.id.descdoes);
//        datedoes = findViewById(R.id.datedoes);
//
//        btnSaveTask = findViewById(R.id.btnSaveTask);
//        btnCancel = findViewById(R.id.btnCancel);
//
//        final String keydoes = Integer.toString(doesNum);
//
//
//        btnSaveTask.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                reference = FirebaseDatabase.getInstance().getReference().child("DoesApp")
//                        .child("Does" + doesNum);
//
//
//                reference.addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(DataSnapshot dataSnapshot) {
//
//                        dataSnapshot.getRef().child("titledoes").setValue(titledoes.getText().toString());
//                        dataSnapshot.getRef().child("descdoes").setValue(descdoes.getText().toString());
//                        dataSnapshot.getRef().child("datedoes").setValue(datedoes.getText().toString());
//                        dataSnapshot.getRef().child("keydoes").setValue(keydoes);
//
//
//                        Intent intent = new Intent(NewTaskAct.this, MainActivity.class);
//                        startActivity(intent);
//
//
//                        Log.d("Complete", "Data Changed!!!!");
//
//
//                    }
//
//                    @Override
//                    public void onCancelled(DatabaseError databaseError) {
//
//                        Log.d("Complete", "NOT CHANGED "+ databaseError.toString());
//
//                    }
//                });
//
//            }
//        });
//
//
//        // import font
//        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/ML.ttf");
//        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MM.ttf");
//
//        // customize font
//        titlepage.setTypeface(MMedium);
//
//        addtitle.setTypeface(MLight);
//        titledoes.setTypeface(MMedium);
//
//        adddesc.setTypeface(MLight);
//        descdoes.setTypeface(MMedium);
//
//        adddate.setTypeface(MLight);
//        datedoes.setTypeface(MMedium);
//
//        btnSaveTask.setTypeface(MMedium);
//        btnCancel.setTypeface(MLight);
//
//    }
//}
