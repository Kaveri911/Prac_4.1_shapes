package ru.mirea.kvbo01.senkov;
import java.lang.Math;
public class Circle extends Shape
{
private double r;

public Circle(double r)
{
    this.r=r;
}
    @Override
    public String getType() {
        return "Это круг!";
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
