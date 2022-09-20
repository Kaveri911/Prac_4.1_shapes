package ru.mirea.kvbo01.senkov;

public class Rectangle extends Shape
{
    private double  a;
     private  double b;
     public Rectangle(double a,double b)
     {
         this.a=a;
         this.b=b;
     }
     public double getArea ()
     {
         return this.a*this.b;
     }

    @Override
    public double getPerimetr() {
        return this.a+this.b;
    }


    @Override
    public String getType() {
        return "Это прямоугольник!";
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
