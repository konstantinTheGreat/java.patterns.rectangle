package main.java.factory;


import main.java.entities.Point;
import main.java.entities.Quadrilateral;
import main.java.exception.QuadrilateralException;

import java.io.IOException;
import java.util.List;

public interface QuadrilateralFactory {
    List<Quadrilateral> createQuadrilaterals(String file) throws QuadrilateralException, IOException;
    Quadrilateral createQuadrilateral(Point a, Point b, Point c, Point d) throws QuadrilateralException;
}
