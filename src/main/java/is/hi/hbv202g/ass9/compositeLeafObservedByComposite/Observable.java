package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.*;

public abstract class Observable{

    private List<Observer> observers;

    public Observable(){
        observers = new ArrayList<Observer>();
    }
    public void attach (Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
