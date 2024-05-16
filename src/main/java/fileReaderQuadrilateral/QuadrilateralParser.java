package main.java.fileReaderQuadrilateral;

import main.java.entity.Point;

import java.io.IOException;
import java.util.List;

public interface QuadrilateralParser {
    List<Point[]> parseQuadrilateralPoints(String file) throws IOException;
}
