package main.java.service;

import main.java.entity.Quadrilateral;

public interface QuadrilateralService {
    double perimeter(Quadrilateral quadrilateral);
    double area(Quadrilateral quadrilateral);
    boolean convex(Quadrilateral quadrilateral);
}
