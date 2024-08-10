package org.thyron.Abstraction;

interface Vehicle{
   void start();
}
class Car implements Vehicle{
    public void start() {
        System.out.println("Car Starts");
    }
}

public class Example1_With_Interface {
    public static void main(String[] args) {
        Vehicle v=new Car();
        v.start();

        Car c=new Car();
        c.start();
        
    }
}