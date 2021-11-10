package com.hamid.designPatterns.singleton;

public class Singleton {
    private Singleton(){

    }
    private static Singleton singelton=null;

    public static Singleton getSingelton() {
        if(singelton==null) {
            System.out.println("Created new object => Singleton");
            singelton = new Singleton();
        }
        return singelton;
    }
}
