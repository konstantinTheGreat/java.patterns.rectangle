package main.java.com.packages.quadrilaterals.service;

import main.java.com.packages.quadrilaterals.entity.Quadrilateral;

public interface QuadrilateralService {
    double perimeter(Quadrilateral quadrilateral);
    double area(Quadrilateral quadrilateral);
    boolean convex(Quadrilateral quadrilateral);
}
