package org.example.decorator;

import org.example.entity.Shape;

public class AreaCalculatorDecorator extends ShapeDecorator{
    public AreaCalculatorDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void acreage() {
        System.out.println(" + square = 10.0");
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        acreage();
    }
}
