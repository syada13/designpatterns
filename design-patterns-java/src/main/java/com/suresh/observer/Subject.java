package com.suresh.observer;

/* Objects use this Subject interface to register as observer
and remove themselves from being observers
 * 
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
