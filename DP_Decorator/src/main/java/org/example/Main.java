package org.example;

import org.example.decorator.AreaCalculatorDecorator;
import org.example.decorator.ColorDecorator;
import org.example.entity.Circle;
import org.example.entity.Rectangle;
import org.example.entity.Shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========");
        Shape shape = new Circle();
        shape.draw();
        System.out.println("==========");
        Shape shape1 = new AreaCalculatorDecorator(new Circle());
        shape1.draw();
        System.out.println("==========");
        Shape shape2 = new ColorDecorator(new Circle(),"Blue");
        shape2.draw();
        System.out.println("==========");
        Shape shape3 = new ColorDecorator(new AreaCalculatorDecorator(new Circle()),"Red");
        shape3.draw();
        System.out.println("==========");
        Shape shape4 = new ColorDecorator(new AreaCalculatorDecorator(new Rectangle()),"Violet");
        shape4.draw();
    }
}