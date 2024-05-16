package main.java.com.packages.quadrilaterals.validator;

import main.java.com.packages.quadrilaterals.entity.Point;

public interface QuadrilateralValidator {
    boolean hasCorrectInput(String[] points);
    boolean hasFourPoints(String[] points);

    boolean isValid(Point[] points);

}
