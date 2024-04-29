package main.java.Actions;

import main.java.Entities.Point;
import main.java.Entities.QuadrilateralType;

public class GetQuadrilateralTypeAction {
    private final QuadrilateralTypeValidator[] validators = {
            new SquareTypeValidator(),
            new DiamondTypeValidator(),
            new TrapezoidTypeValidator()
    };
    public GetQuadrilateralTypeAction() {}

    public QuadrilateralType getType(Point a, Point b, Point c, Point d) {
        for(QuadrilateralTypeValidator validator : validators) {
            if (validator.validate(a, b, c, d)) {
                return validator.getType();
            }
        }
        return QuadrilateralType.GENERIC;
    }
}


