package shapes;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double equalSide, double base) {
        super(equalSide, equalSide, base);
    }

    @Override
    public double getPerimeter() {
        return 2 * side1 + side3;
    }

    @Override
    public double getArea() {
        return (side3 / 2) * Math.sqrt(side1 * side1 - (side3 * side3 / 4));
    }
}
