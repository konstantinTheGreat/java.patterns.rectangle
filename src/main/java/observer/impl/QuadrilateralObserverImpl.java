package main.java.observer.impl;

import main.java.Entities.Quadrilateral;
import main.java.observer.QuadrilateralObserver;
import main.java.Entities.QuadrilateralType;
public class QuadrilateralObserverImpl implements QuadrilateralObserver {

    @Override
    public void update(Quadrilateral quadrilateral) {
        QuadrilateralType state = QuadrilateralType.check(quadrilateral);
        //todo
    }
}
