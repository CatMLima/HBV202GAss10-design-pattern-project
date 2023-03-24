package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observer;

import java.util.*;

public abstract class Observable {

    private List<is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observer> observers;

    public Observable(){
        observers = new ArrayList<is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observer>();
    }
    public void attach (is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observer observer){
        observers.add(observer);
    }
    public void detach(is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
