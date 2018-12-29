package com.runoob.abstract_factory_pattern;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    /**
     * 根据形状类型获取形状对象
     * @param shapeType 形状类型
     * @return 形状对象
     */
    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
        }
        return null;
    }
}
