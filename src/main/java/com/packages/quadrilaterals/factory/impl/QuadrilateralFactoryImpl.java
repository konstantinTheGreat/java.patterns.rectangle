package main.java.com.packages.quadrilaterals.factory.impl;

import main.java.com.packages.quadrilaterals.entity.Quadrilateral;
import main.java.com.packages.quadrilaterals.exception.QuadrilateralException;
import main.java.com.packages.quadrilaterals.factory.QuadrilateralFactory;
import main.java.com.packages.quadrilaterals.fileReaderQuadrilateral.QuadrilateralParser;
import main.java.com.packages.quadrilaterals.fileReaderQuadrilateral.impl.QuadrilateralParserImpl;
import main.java.com.packages.quadrilaterals.entity.Point;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class QuadrilateralFactoryImpl implements QuadrilateralFactory {
    @Override
    public List<Quadrilateral> createListQuadrilateral(String file) throws IOException {
        QuadrilateralParser parser = new QuadrilateralParserImpl();
        List<Quadrilateral> quadrilaterals = new ArrayList<>();
        List<Point[]> points = parser.parseQuadrilateralPoints(file);
        for (Point[] point : points) {
            quadrilaterals.add(new Quadrilateral(point[0], point[1], point[2], point[3]));
        }

        return quadrilaterals;
    }

    @Override
    public Quadrilateral createQuadrilateral(Point a, Point b, Point c, Point d) throws QuadrilateralException {
        return new Quadrilateral(a, b, c, d);
    }

}
