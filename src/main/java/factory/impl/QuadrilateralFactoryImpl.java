package main.java.factory.impl;

import main.java.Entities.Point;
import main.java.Entities.Quadrilateral;
import main.java.exception.QuadrilateralException;
import main.java.factory.QuadrilateralFactory;

import java.util.List;

public class QuadrilateralFactoryImpl implements QuadrilateralFactory {
    @Override
    public List<Quadrilateral> createQuadrilateral(Point[][] pointsArray) throws QuadrilateralException {
        return null; //todo
    }
}
