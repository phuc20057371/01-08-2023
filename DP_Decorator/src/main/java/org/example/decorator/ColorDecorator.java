package org.example.decorator;

import org.example.entity.Shape;

public class ColorDecorator extends ShapeDecorator{
    private String color;
    public ColorDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color=color;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println(" + Color: " + color);
    }
    @Override
    public void erase() {
        System.out.println("Erasing a colored shape");
    }
}
