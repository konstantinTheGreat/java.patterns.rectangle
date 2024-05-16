package main.java.com.packages.quadrilaterals.observer;

public interface Observable {
    void attach();
    void detach();
    void notifyObservers();
}
