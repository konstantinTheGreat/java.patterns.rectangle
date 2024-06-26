package main.java.com.packages.quadrilaterals.main;

import main.java.com.packages.quadrilaterals.entity.Point;
import main.java.com.packages.quadrilaterals.entity.Quadrilateral;
import main.java.com.packages.quadrilaterals.entity.Warehouse;
import main.java.com.packages.quadrilaterals.exception.QuadrilateralException;
import main.java.com.packages.quadrilaterals.factory.QuadrilateralFactory;
import main.java.com.packages.quadrilaterals.factory.impl.QuadrilateralFactoryImpl;
import main.java.com.packages.quadrilaterals.service.QuadrilateralService;
import main.java.com.packages.quadrilaterals.service.impl.QuadrilateralServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, QuadrilateralException {
        String file = "src/resources/points.txt";  //route to our txt file
        QuadrilateralFactory factory = new QuadrilateralFactoryImpl(); // creating quadrilateral factory
        QuadrilateralService service = new QuadrilateralServiceImpl(); // creating service for quadrilateral
        Warehouse warehouse = Warehouse.getInstance();
        List<Quadrilateral> quadrilaterals = factory.createListQuadrilateral(file); // created quadrilaterals using factory

        for (Quadrilateral quadrilateral : quadrilaterals) {        //adding area and perimeter to the warehouse
            double perimeter = service.perimeter(quadrilateral);
            List<Double> data = new ArrayList<>();
            data.add(service.area(quadrilateral));
            data.add(service.perimeter(quadrilateral));
            warehouse.put(quadrilateral.getQuadrilateralId(), data);
        }

        Quadrilateral quadrilateral = quadrilaterals.get(1);        //updating one of the quadrilaterals
        Point myPoint = new Point(-100,-10);
        quadrilateral.setA(myPoint);

    }
}