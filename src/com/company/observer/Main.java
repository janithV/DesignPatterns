package com.company.observer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Observer observer1 = new Type1Observer();
        Observer observer2 = new Type1Observer();
        Observer observer3 = new Type2Observer();


        Subject subject=new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

        subject.notifyObservers("curfew will be informed today!");

        Thread.sleep(10000);
        System.out.println("======================================================");

        subject.notifyObservers("Reversed: curfew will not be informed today!");

        Thread.sleep(5000);
        System.out.println("======================================================");

        subject.unSubscribe(observer2);

        Thread.sleep(5000);
        System.out.println("======================================================");

        subject.notifyObservers("Fuel prices gone up!");

    }


}









