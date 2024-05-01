package main.java.validator.impl;

import main.java.entities.Point;
import main.java.validator.QuadrilateralValidator;

import java.util.List;

public class QuadrilateralValidatorImpl implements QuadrilateralValidator {

    @Override
    public boolean hasCorrectInput(String[] points) {
        for (String point : points) {
            if (!point.matches("-?\\d+,\\s*-?\\d+")) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean hasFourPoints(String[] points) {
        return points.length == 4;
    }

    @Override
    public boolean isValid(Point[] points) {
        for (int i = 0; i < 4; i++) {
            if (isCollinear(points[(i) % 4], points[(i + 1) % 4], points[(i + 2) % 4])) {
                return false;
            }
        }
        return true;
    }
    private boolean isCollinear(Point p1, Point p2, Point p3) {
        return Math.abs((p2.getY() - p1.getY()) * (p3.getX() - p2.getX()) - (p3.getY() - p2.getY()) * (p2.getX() - p1.getX())) < 1e-9;
    }
}
