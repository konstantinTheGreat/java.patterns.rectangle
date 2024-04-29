package main.java.Entities;

import main.java.util.IdGenerator;

import java.util.Objects;

public class Quadrilateral {
        private int quadrilateralId;
        private final Point a;
        private final Point b;
        private final Point c;
        private final Point d;
        private QuadrilateralType type = QuadrilateralType.INVALID;

    protected Quadrilateral(Point a, Point b, Point c, Point d, QuadrilateralType type) {
        quadrilateralId = IdGenerator.increment();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getQuadrilateralId() {
        return quadrilateralId;
    }

    public void setQuadrilateralId(int quadrilateralId) {
        this.quadrilateralId = quadrilateralId;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    public QuadrilateralType getType() {
        return type;
    }

    public void setType(QuadrilateralType type) {
        if (type != null) {
            this.type = type;
        }
        //notifyObservers();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadrilateral quadrilateral = (Quadrilateral) o;
        return quadrilateralId == quadrilateral.quadrilateralId
                && Objects.equals(a, quadrilateral.a)
                && Objects.equals(b, quadrilateral.b)
                && Objects.equals(c, quadrilateral.c)
                && Objects.equals(d, quadrilateral.d)
                && type == quadrilateral.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quadrilateralId, a, b, c, d, type);
    }


    @Override
    public String toString() {
        return "Quadrilateral{" +
                "quadrilateralId=" + quadrilateralId +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", type=" + type +
                '}';
    }
}
