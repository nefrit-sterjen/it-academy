package ru.mail.vladislav150199.my.classes.controler;

public class Post {
   private int id;
   private String txt;

    public Post(int i, String hello) {
        id = i;
        txt = hello;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
