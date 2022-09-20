package ru.mirea.kvbo01.senkov;

public class Square extends Shape{
    private double a;

    public Square(double a)
    {
        this.a=a;
    }

    @Override
    public String getType() {
        return "Это квадрат!";
    }

    @Override
    public double getArea() {
        return this.a*this.a;
    }

    @Override
    public double getPerimetr() {
        return this.a+this.a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
