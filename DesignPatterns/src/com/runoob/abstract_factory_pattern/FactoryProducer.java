package com.runoob.abstract_factory_pattern;

public class FactoryProducer {

    public static final String COLOR_FACTORY = "colorFactory";
    public static final String SHAPE_FACTORY = "shapeFactory";

    public static AbstractFactory getFactory(String choice){
        switch (choice) {
            case COLOR_FACTORY:
                return new ColorFactory();
            case SHAPE_FACTORY:
                return new ShapeFactory();
        }
        return null;
    }
}
