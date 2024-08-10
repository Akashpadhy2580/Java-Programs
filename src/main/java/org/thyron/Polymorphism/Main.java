package org.thyron.Polymorphism;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Parent a=new Subclass1();
        a.print();

        Parent b=new Subclass2();
        b.print();
    }
}