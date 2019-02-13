package com.pearlstudios.nasir.notes;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nasir on 2019-02-11.
 */

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DoesAdapter extends RecyclerView.Adapter<DoesAdapter.MyViewHolder>{

    Context context;
    ArrayList<MyDoes> myDoes;

    public DoesAdapter(Context c, ArrayList<MyDoes> p) {
        context = c;
        myDoes = p;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.items,viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int i) {
        myViewHolder.titledoes.setText(myDoes.get(i).getTitledoes());
        myViewHolder.descdoes.setText(myDoes.get(i).getDescdoes());
        myViewHolder.datedoes.setText(myDoes.get(i).getDatedoes());



        final String getTitleDoes = myDoes.get(i).getTitledoes();
        final String getDescDoes = myDoes.get(i).getDescdoes();
        final String getDateDoes = myDoes.get(i).getDatedoes();
        final String getKeyDoes = myDoes.get(i).getKeydoes();

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent aa = new Intent(context,EditTaskDesk.class);
//                aa.putExtra("titledoes", getTitleDoes);
//                aa.putExtra("descdoes", getDescDoes);
//                aa.putExtra("datedoes", getDateDoes);
//                aa.putExtra("keydoes", getKeyDoes);
////                context.startActivity(aa);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myDoes.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titledoes, descdoes, datedoes, keydoes;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titledoes = (TextView) itemView.findViewById(R.id.titledoes);
            descdoes = (TextView) itemView.findViewById(R.id.descdoes);
            datedoes = (TextView) itemView.findViewById(R.id.datedoes);
        }
    }

}

//public class DoesAdapter extends RecyclerView.Adapter<DoesAdapter.MyViewHolder> {
//
//    Context context;
//    ArrayList<MyDoes> myDoes;
//
//    public DoesAdapter(Context c, ArrayList<MyDoes> p){
//
//        context = c;
//        myDoes = p;
//    }
//
//    public ArrayList<MyDoes> getMyDoes(){
//        return myDoes;
//    }
//
//    @Override
//    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.items, parent, false ));
//    }
//
//    @Override
//    public void onBindViewHolder(MyViewHolder holder, int position) {
//
//        holder.title.setText(myDoes.get(position).getTitle());
//        holder.date.setText(myDoes.get(position).getDate());
//        holder.description.setText(myDoes.get(position).getDescription());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return myDoes.size();
//    }
//
//
//
//
//
//
//    class MyViewHolder extends RecyclerView.ViewHolder{
//
//        TextView title, date, description;
//
//        public MyViewHolder(View itemView) {
//            super(itemView);
//
//            title = (TextView)itemView.findViewById(R.id.titledoes);
//            date = (TextView)itemView.findViewById(R.id.datedoes);
//            description = (TextView)itemView.findViewById(R.id.descdoes);
//        }
//    }
//}
