package main.java.Entities;

import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;

public class Warehouse {
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

    public List<Double> put(Integer key, List<Double> value) {
        return map.put(key, value);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Warehouse.class.getSimpleName() + "[", "]")
                .add("map=" + map)
                .toString();
    }
}
