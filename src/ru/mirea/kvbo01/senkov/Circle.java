package ru.mirea.kvbo01.senkov;
import java.lang.Math;
public class Circle extends Shape
{
protected double radius;

public Circle(double radius, String color,boolean filled)
{
    this.radius = radius;
    this.color=color;
    this.filled=filled;
}
    @Override
    public String getType() {
        return "Это круг!";
    }

    @Override
    public double getArea() {
        return Math.PI* radius * radius;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI* radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
