package main.java.Actions;

import main.java.Entities.Point;
import main.java.Entities.QuadrilateralType;

abstract class QuadrilateralTypeValidator {
    QuadrilateralType type;

    abstract boolean validate(Point a, Point b, Point c, Point d);
    QuadrilateralTypeValidator(QuadrilateralType type) {
        this.type = type;
    }

    public QuadrilateralType getType() {
        return type;
    }
}
