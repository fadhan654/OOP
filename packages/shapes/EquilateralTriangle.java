package shapes;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public double getPerimeter() {
        return 3 * side1;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side1 * side1;
    }
}
