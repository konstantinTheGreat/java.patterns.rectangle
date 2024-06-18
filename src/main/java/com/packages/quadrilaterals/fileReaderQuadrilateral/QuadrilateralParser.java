package main.java.com.packages.quadrilaterals.fileReaderQuadrilateral;

import main.java.com.packages.quadrilaterals.entity.Point;
import main.java.com.packages.quadrilaterals.exception.QuadrilateralException;

import java.io.IOException;
import java.util.List;

public interface QuadrilateralParser {
    List<Point[]> parseQuadrilateralPoints(String file) throws QuadrilateralException;
}
