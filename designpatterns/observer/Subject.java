package designpatterns.observer;

import java.util.*;

public interface Subject {
    public void registerObserver(Observer o);

    public void unregisterObserver(Observer o);

    public void notifyObservers();
}

class Shape implements Subject {
    public int length;
    public int breath;
    ArrayList<Observer> observerList;

    public Shape() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void unregisterObserver(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer obj : observerList) {
            obj.update(length, breath);
        }

    }

    private int getUpdateLength() {
        return 20;
    }

    private int getUpdatedBreadth() {
        return 25;
    }

    public void dataChanged() {
        length = getUpdateLength();
        breath = getUpdatedBreadth();
        notifyObservers();
    }
}
