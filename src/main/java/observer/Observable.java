package main.java.observer;

public interface Observable {
    void attach();
    void detach();
    void notifyObservers();
}
