package main.java.Actions;

import main.java.Entities.Point;
import main.java.Entities.QuadrilateralType;

class SquareTypeValidator extends QuadrilateralTypeValidator {
    public SquareTypeValidator() {
        super(QuadrilateralType.SQUARE);
    }

    @Override
    boolean validate(Point a, Point b, Point c, Point d) {
        return false; //todo
    }
}
