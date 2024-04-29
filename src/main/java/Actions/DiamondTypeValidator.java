package main.java.Actions;

import main.java.Entities.Point;
import main.java.Entities.QuadrilateralType;

class DiamondTypeValidator extends QuadrilateralTypeValidator {

    DiamondTypeValidator() {
        super(QuadrilateralType.DIAMOND);
    }

    @Override
    boolean validate(Point a, Point b, Point c, Point d) {
        return false;
    }
}
