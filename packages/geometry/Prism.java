package geometry;
import shapes.Shape;

public class Prism implements Geometry {
    @Override
    public double getVolume(Shape baseShape, double height) {
        return baseShape.getArea() * height;
    }
}
