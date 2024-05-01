package main.java.service.impl;

import main.java.entities.Quadrilateral;
import main.java.observer.impl.QuadrilateralObserverImpl;
import main.java.service.QuadrilateralService;

import java.util.logging.Logger;

public class QuadrilateralServiceImpl implements QuadrilateralService {
    private static final Logger logger = Logger.getLogger(QuadrilateralObserverImpl.class.getName());
    @Override
    public double perimeter(Quadrilateral quadrilateral) {
        return quadrilateral.getSideA() + quadrilateral.getSideB() + quadrilateral.getSideC() + quadrilateral.getSideD();
    }

    @Override
    public double area(Quadrilateral quadrilateral) {
        Double halfP = perimeter(quadrilateral) / 2;
        return Math.sqrt((halfP * quadrilateral.getSideC())*(halfP - quadrilateral.getSideB()) * (halfP - quadrilateral.getSideA()) * (halfP - quadrilateral.getSideD()));
    }

    @Override
    public boolean convex(Quadrilateral quadrilateral) {
        //todo
        return false;
    }

}
