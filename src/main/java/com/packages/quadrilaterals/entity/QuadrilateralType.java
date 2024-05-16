package main.java.com.packages.quadrilaterals.entity;

public enum QuadrilateralType {
    RHOMBUS,
    KITE,
    TRAPEZOID,
    PARALLELOGRAM,
    GENERIC;

    public static QuadrilateralType check(Quadrilateral quadrilateral) {
        return stateCheck(quadrilateral);
    }

    private static QuadrilateralType stateCheck(Quadrilateral quadrilateral) {

        if(quadrilateral.getSideA() == quadrilateral.getSideB() &&
                quadrilateral.getSideB() == quadrilateral.getSideC() &&
                quadrilateral.getSideC() == quadrilateral.getSideD()) {
            if (quadrilateral.getDiagonalAC() == quadrilateral.getDiagonalBD()){
                return RHOMBUS;
            }
            return KITE;
        }

        if (slope(quadrilateral.getA(), quadrilateral.getB()) == slope(quadrilateral.getC(), quadrilateral.getD()) &&
                slope(quadrilateral.getA(), quadrilateral.getD()) == slope(quadrilateral.getB(), quadrilateral.getC())) {
            return PARALLELOGRAM;
        } else if (slope(quadrilateral.getA(), quadrilateral.getB()) == slope(quadrilateral.getC(), quadrilateral.getD()) ||
                slope(quadrilateral.getA(), quadrilateral.getD()) == slope(quadrilateral.getB(), quadrilateral.getC())) {
            return TRAPEZOID;
        }
        return GENERIC;
    }

    public static double slope(Point A, Point B) {
        return (B.getY() - A.getY()) / (B.getX() - A.getX());
    }
}
