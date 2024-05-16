package main.java.com.packages.quadrilaterals.fileReaderQuadrilateral;

import main.java.com.packages.quadrilaterals.entity.Point;

import java.io.IOException;
import java.util.List;

public interface QuadrilateralParser {
    List<Point[]> parseQuadrilateralPoints(String file) throws IOException;
}
