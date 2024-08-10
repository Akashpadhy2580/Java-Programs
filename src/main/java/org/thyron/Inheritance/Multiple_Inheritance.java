package org.thyron.Inheritance;

interface One
{
    public void printOne();
}
interface Two
{
    public void printTwo();
}
interface Three extends One,Two
{
    public void printOne();
}

class Child implements Three
{
    public void printOne(){
        System.out.println("Print 1");
    }


    public void printTwo() {
        System.out.println("Print 2");
    }
}

public class Multiple_Inheritance {
    public static void main (String[] args){
        Child c=new Child();
        c.printOne();
        c.printTwo();

        Three t=new Child();
        t.printOne();
        t.printTwo();
    }


}
