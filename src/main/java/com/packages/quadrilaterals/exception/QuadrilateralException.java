package main.java.com.packages.quadrilaterals.exception;

public class QuadrilateralException extends Exception {
    public QuadrilateralException(){

    }

    public QuadrilateralException(String message) {
        super(message);
    }

    public QuadrilateralException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuadrilateralException(Throwable cause) {
        super(cause);
    }

}
