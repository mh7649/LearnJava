package com.runoob.factory_pattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape(Shape.SHAPE_TYPE_CIRCLE);
        circle.draw();
        Shape rectangle = shapeFactory.getShape(Shape.SHAPE_TYPE_RECTANGLE);
        rectangle.draw();
        Shape square = shapeFactory.getShape(Shape.SHAPE_TYPE_SQUARE);
        square.draw();
    }
}
