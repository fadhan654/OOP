package main;

import geometry.*;
import shapes.*;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(6);
        Cube cube = new Cube();
        Prism prism = new Prism();
        Cylinder cylinder = new Cylinder();
        Block block = new Block();

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Equilateral Triangle Area: " + equilateralTriangle.getArea());

        Shape rectangleBase = new Rectangle(4, 2);
        Shape circleBase = new Circle(3);
        double height = 5;

        System.out.println("Volume of Cube: " + cube.getVolume(rectangleBase, height)); 
        System.out.println("Volume of Prism: " + prism.getVolume(rectangleBase, height));
        System.out.println("Volume of Cylinder: " + cylinder.getVolume(circleBase, height));
        System.out.println("Volume of Block: " + block.getVolume(rectangleBase, height));
    }
}
