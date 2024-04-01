package geometry;

import shapes.Shape;

public class Cylinder implements Geometry {

    @Override
    public double getVolume(Shape baseShape, double height) {
        return Math.PI * baseShape.getArea() * height;
    }
}
