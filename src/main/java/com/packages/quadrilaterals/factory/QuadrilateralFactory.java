package main.java.com.packages.quadrilaterals.factory;


import main.java.com.packages.quadrilaterals.entity.Quadrilateral;
import main.java.com.packages.quadrilaterals.exception.QuadrilateralException;
import main.java.com.packages.quadrilaterals.entity.Point;

import java.io.IOException;
import java.util.List;

public interface QuadrilateralFactory {
    List<Quadrilateral> createListQuadrilateral(String file) throws QuadrilateralException, IOException;
    Quadrilateral createQuadrilateral(Point a, Point b, Point c, Point d) throws QuadrilateralException;
}
