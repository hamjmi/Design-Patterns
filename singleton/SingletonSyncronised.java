package com.hamid.designPatterns.singleton;

public class SingletonSyncronised {
    private SingletonSyncronised(){

    }
    private static SingletonSyncronised singelton=null;

    public static SingletonSyncronised getSingelton() {
        if(singelton==null) {
            synchronized (SingletonSyncronised.class) {
                if (singelton == null) {
                    System.out.println("Created new object => SingletonSyncronised");
                    singelton = new SingletonSyncronised();
                }
            }
        }
        return singelton;
    }
}
