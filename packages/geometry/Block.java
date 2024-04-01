package geometry;

import shapes.Shape;

public class Block implements Geometry {

    @Override
    public double getVolume(Shape baseShape, double height) {
        return baseShape.getArea() * height * 2;  
    }
}
