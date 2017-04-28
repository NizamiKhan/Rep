package com.nizami.singleton;

public class Main {

    public static void main(String[] args) {

        //Singleton ss=new Singleton(); ошибка

        Singleton.getInstance().print();
    }
}
