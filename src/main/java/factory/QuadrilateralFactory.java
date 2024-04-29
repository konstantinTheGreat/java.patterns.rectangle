package main.java.factory;


import main.java.Entities.Point;
import main.java.Entities.Quadrilateral;
import main.java.exception.QuadrilateralException;

import java.util.List;

public interface QuadrilateralFactory {
    List<Quadrilateral> createQuadrilateral(Point[][] pointsArray) throws QuadrilateralException;
}
