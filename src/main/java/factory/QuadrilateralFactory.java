package main.java.factory;


import main.java.entity.Point;
import main.java.entity.Quadrilateral;
import main.java.exception.QuadrilateralException;

import java.io.IOException;
import java.util.List;

public interface QuadrilateralFactory {
    List<Quadrilateral> createListQuadrilateral(String file) throws QuadrilateralException, IOException;
    Quadrilateral createQuadrilateral(Point a, Point b, Point c, Point d) throws QuadrilateralException;
}
