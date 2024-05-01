package main.java.observer.impl;

import main.java.entities.Quadrilateral;
import main.java.entities.Warehouse;
import main.java.observer.QuadrilateralObserver;
import main.java.entities.QuadrilateralType;
import main.java.service.QuadrilateralService;
import main.java.service.impl.QuadrilateralServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class QuadrilateralObserverImpl implements QuadrilateralObserver {
    private static final Logger logger = Logger.getLogger(QuadrilateralObserverImpl.class.getName());
    @Override
    public void update(Quadrilateral quadrilateral) {
        logger.info("Updating quadrilateral");
        QuadrilateralType state = QuadrilateralType.check(quadrilateral);
        QuadrilateralService service = new QuadrilateralServiceImpl();
        Warehouse warehouse = Warehouse.getInstance();
        if (quadrilateral.getType() != state) {
            quadrilateral.setType(state);
            logger.info("Updated type");
        }
        List<Double> characteristics = new ArrayList<>();
        characteristics.add(service.perimeter(quadrilateral));
        characteristics.add(service.area(quadrilateral));
        warehouse.put(quadrilateral.getQuadrilateralId(), characteristics);
        logger.info("Update perimeter and area");

    }
}
