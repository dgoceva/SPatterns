package com.company;

public class FactoryPatternDemo {

    public static void main(String[] args) {
	// write your code here
        ShapeFactory factory = new ShapeFactory();
//        Shape demo = factory.getShape("DEMO");
        Shape circle = factory.getShape("circle");
        Shape rect = factory.getShape("rectangle");
        Shape square = factory.getShape("square");
        circle.draw();
        rect.draw();
        square.draw();
    }
}
