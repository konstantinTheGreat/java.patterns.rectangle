package main.java.validator;

import main.java.entity.Point;

public interface QuadrilateralValidator {
    boolean hasCorrectInput(String[] points);
    boolean hasFourPoints(String[] points);

    boolean isValid(Point[] points);

}
