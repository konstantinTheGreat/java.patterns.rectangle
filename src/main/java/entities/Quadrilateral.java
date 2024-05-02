package main.java.entities;

import main.java.observer.Observable;
import main.java.observer.QuadrilateralObserver;
import main.java.observer.impl.QuadrilateralObserverImpl;
import main.java.util.IdGenerator;

import java.util.Objects;
import java.util.logging.Logger;

public class Quadrilateral implements Observable {
        private static final Logger logger = Logger.getLogger(Quadrilateral.class.getName());
        private int quadrilateralId;
        private Point a;
        private Point b;
        private Point c;
        private Point d;
        private QuadrilateralType type;
        private QuadrilateralObserver observer = new QuadrilateralObserverImpl();

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        quadrilateralId = IdGenerator.increment();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        type = QuadrilateralType.check(this);
        logger.info("Created new quadrilateral" + this.getQuadrilateralId());
    }

    public int getQuadrilateralId() {
        return quadrilateralId;
    }

    public void setQuadrilateralId(int quadrilateralId) {
        this.quadrilateralId = quadrilateralId;
        notifyObservers();
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

    public void setA(Point a) {
        logger.info("Point a updated to:" + a);
        this.a = a;
        notifyObservers();
    }

    public void setB(Point b) {
        logger.info("Point a updated to:" + a);
        this.b = b;
        notifyObservers();
    }

    public void setC(Point c) {
        logger.info("Point a updated to:" + a);
        this.c = c;
        notifyObservers();
    }

    public void setD(Point d) {
        logger.info("Point a updated to:" + a);
        this.d = d;
        notifyObservers();
    }

    public double getSideA(){
        return getSide(a, b);
    }
    public double getSideB(){
        return getSide(b, c);
    }
    public double getSideC(){
        return getSide(c, d);
    }
    public double getSideD(){
        return getSide(d, a);
    }

    public double getDiagonalAC() {
        return getSide(a, c);
    }
    public double getDiagonalBD() {
        return getSide(b, d);
    }
    private double getSide(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
    public QuadrilateralType getType() {
        return type;
    }

    public void setType(QuadrilateralType type) {
        this.type = type;
    }

    @Override
    public void attach() {
        this.observer = new QuadrilateralObserverImpl();
    }

    @Override
    public void detach() {
        this.observer = null;
    }

    @Override
    public void notifyObservers() {
        if (observer != null) {
            observer.update(this);
        }
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
                ", a=" + getSideA() +
                ", b=" + getSideB() +
                ", c=" + getSideC() +
                ", d=" + getSideD() +
                ", type=" + type +
                '}';
    }
}
