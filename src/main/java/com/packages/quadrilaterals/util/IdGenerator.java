package main.java.com.packages.quadrilaterals.util;

public class IdGenerator {
    private static int currentId;
    public static int increment(){
        return ++currentId;
    }
}
