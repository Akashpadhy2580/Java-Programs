package org.thyron.Abstraction;

import org.thyron.Polymorphism.Parent;
import org.thyron.Polymorphism.Subclass1;
import org.thyron.Polymorphism.Subclass2;

abstract class Shape{
   abstract void draw();
}
class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Example1_With_AbstractClass {
    public static void main(String[] args) {
        Shape s=new Circle();
        s.draw();

        Circle c=new Circle();
        c.draw();

    }
}