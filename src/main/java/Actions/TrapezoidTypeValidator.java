package main.java.Actions;

import main.java.Entities.Point;
import main.java.Entities.QuadrilateralType;

class TrapezoidTypeValidator extends QuadrilateralTypeValidator {
    TrapezoidTypeValidator() {
        super(QuadrilateralType.TRAPEZOID);
    }

    @Override
    boolean validate(Point a, Point b, Point c, Point d) {
        return false;
    }
}
