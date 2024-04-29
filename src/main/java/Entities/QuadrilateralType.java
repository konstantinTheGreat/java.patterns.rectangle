package main.java.Entities;

public enum QuadrilateralType {
    SQUARE,
    DIAMOND,
    TRAPEZOID,
    GENERIC,
    INVALID;

    public static QuadrilateralType check(Quadrilateral quadrilateral) {
        return stateCheck(quadrilateral.getA(), quadrilateral.getB(), quadrilateral.getC(), quadrilateral.getD());
    }

    public static QuadrilateralType stateCheck(Point a, Point b, Point c, Point d) {

    }
}
