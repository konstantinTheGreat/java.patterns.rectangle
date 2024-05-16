package main.java.fileReaderQuadrilateral.impl;

import main.java.fileReaderQuadrilateral.QuadrilateralParser;
import main.java.entity.Point;
import main.java.validator.QuadrilateralValidator;
import main.java.validator.impl.QuadrilateralValidatorImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuadrilateralParserImpl implements QuadrilateralParser {
    @Override
    public List<Point[]> parseQuadrilateralPoints(String file) throws IOException {
        QuadrilateralValidator validator = new QuadrilateralValidatorImpl();
        List<Point[]> quadrilaterals = new ArrayList<>();
        File points = new File(file);
        try(BufferedReader reader = new BufferedReader(new FileReader(points))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] pointsArray = line.trim().replaceAll(";$", "").split(";");
                if(!validator.hasFourPoints(pointsArray) || !validator.hasCorrectInput(pointsArray)) {
                    continue;
                }
                Point[] pointArray = new Point[pointsArray.length];
                for (int i = 0; i < pointsArray.length; i++) {
                    String[] coordinates = pointsArray[i].split(",");
                    float x = Float.parseFloat(coordinates[0]);
                    float y = Float.parseFloat(coordinates[1]);
                    pointArray[i] = new Point(x, y);
                }
                if (!validator.isValid(pointArray)) {
                    continue;
                }
                quadrilaterals.add(pointArray);
            }
        }

        return quadrilaterals;
    }
}