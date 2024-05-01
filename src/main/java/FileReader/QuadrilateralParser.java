package main.java.FileReader;

import main.java.entities.Point;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface QuadrilateralParser {
    List<Point[]> parseQuadrilateralPoints(String file) throws IOException;
}
