package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observers= new ArrayList<>();

    void subscribe(Observer observer){
        observers.add(observer);
    }

    void unSubscribe(Observer observer){
        observers.remove(observer);
    }

    void notifyObservers(String news){
        for (Observer observer : observers) {
            observer.notifyObserver(news);
        }
    }

}
