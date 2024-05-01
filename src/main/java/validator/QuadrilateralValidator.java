package main.java.validator;

import main.java.entities.Point;

import java.util.List;

public interface QuadrilateralValidator {
    boolean hasCorrectInput(String[] points);
    boolean hasFourPoints(String[] points);

    boolean isValid(Point[] points);

}
