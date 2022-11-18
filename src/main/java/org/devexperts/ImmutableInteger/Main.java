package org.devexperts.ImmutableInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MutableInteger mutableInteger = new MutableInteger();
        Runnable r = () -> mutableInteger.setValue(12);
        Runnable r3 = () -> mutableInteger.setValue(13);

        Runnable r2 = mutableInteger::getValue;
        Runnable r4 = mutableInteger::getValue;

        Thread t3 = new Thread(r3);
        t3.start();
        Thread t  = new Thread(r);
        t.start();
        Thread t2 = new Thread(r2);
        t2.start();

        Thread t4 = new Thread(r4);
        t4.start();


    }
}