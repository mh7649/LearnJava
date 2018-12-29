package com.runoob.abstract_factory_pattern;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        switch (color) {
            case Color.BLUE_COLOR:
                return new Blue();
            case Color.GREEN_COLOR:
                return new Green();
            case Color.RED_COLOR:
                return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
