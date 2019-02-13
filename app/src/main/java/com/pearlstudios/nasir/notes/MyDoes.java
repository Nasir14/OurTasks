package com.pearlstudios.nasir.notes;

/**
 * Created by nasir on 2019-02-11.
 */

public class MyDoes {

    String titledoes;
    String datedoes;
    String descdoes;
    String keydoes;

    public MyDoes() {
    }

    public MyDoes(String titledoes, String datedoes, String descdoes, String keydoes) {
        this.titledoes = titledoes;
        this.datedoes = datedoes;
        this.descdoes = descdoes;
        this.keydoes = keydoes;
    }

    public String getKeydoes() {
        return keydoes;
    }

    public void setKeydoes(String keydoes) {
        this.keydoes = keydoes;
    }

    public String getTitledoes() {
        return titledoes;
    }

    public void setTitledoes(String titledoes) {
        this.titledoes = titledoes;
    }

    public String getDatedoes() {
        return datedoes;
    }

    public void setDatedoes(String datedoes) {
        this.datedoes = datedoes;
    }

    public String getDescdoes() {
        return descdoes;
    }

    public void setDescdoes(String descdoes) {
        this.descdoes = descdoes;
    }
}

//public class MyDoes {
//    String title, date, description;
//
//    public MyDoes(String title, String date, String description) {
//        this.title = title;
//        this.date = date;
//        this.description = description;
//    }
//
//    @Override
//    public String toString() {
//        return "MyDoes{" +
//                "title='" + title + '\'' +
//                ", date='" + date + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }
//
//    public MyDoes() {
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//
//}
