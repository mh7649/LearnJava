package com.runoob.factory_pattern;

public class ShapeFactory {

    /**
     * 根据形状类型获取形状对象
     * @param shapeType 形状类型
     * @return 形状对象
     */
    public Shape getShape(String shapeType) {
        if ("CIRCLE".equals(shapeType)) {
            return new Circle();
        } else if ("RECTANGLE".equals(shapeType)) {
            return new Rectangle();
        } else if ("SQUARE".equals(shapeType)) {
            return new Square();
        }
        return null;
    }
}
