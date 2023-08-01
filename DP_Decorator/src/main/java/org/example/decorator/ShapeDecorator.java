package org.example.decorator;

import org.example.entity.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    public void draw() {
        decoratedShape.draw();
    }
    public void erase() {

    }
}
