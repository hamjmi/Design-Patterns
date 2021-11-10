package com.hamid.designPatterns.singleton;

public class main {
    public static void main(String[] args) {
        Singleton s1= Singleton.getSingelton();
        Singleton s2= Singleton.getSingelton();
        Singleton s3= Singleton.getSingelton();

        SingletonSyncronised t1= SingletonSyncronised.getSingelton();
        SingletonSyncronised t2= SingletonSyncronised.getSingelton();
        SingletonSyncronised t3= SingletonSyncronised.getSingelton();


    }
}
