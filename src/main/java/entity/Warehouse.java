package main.java.entity;

import main.java.observer.impl.QuadrilateralObserverImpl;

import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;
import java.util.logging.Logger;

public class Warehouse {
    private static final Logger logger = Logger.getLogger(QuadrilateralObserverImpl.class.getName());
    private static Warehouse instance = new Warehouse();
    private HashMap<Integer, List<Double>> map = new HashMap<>();

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        return instance;
    }

    public List<Double> get(Integer key) {
        return map.get(key);
    }

    public void put(Integer key, List<Double> quadrilateralInfo) {
        logger.info("Info updated:" + key + " Perimeter = " + quadrilateralInfo.get(0) + " Area = " + quadrilateralInfo.get(1));
        map.put(key, quadrilateralInfo);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Warehouse.class.getSimpleName() + "[", "]")
                .add("map=" + map)
                .toString();
    }
}
