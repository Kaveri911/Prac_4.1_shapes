package ru.mirea.kvbo01.senkov;

public class Square extends Shape{
    protected double side;

    public Square(double side, String color, boolean filled)
    {
        this.side = side;
        this.color=color;
        this.filled=filled;

    }

    @Override
    public String getType() {
        return "Это квадрат!";
    }

    @Override
    public double getArea() {
        return this.side *this.side;
    }

    @Override
    public double getPerimetr() {
        return this.side +this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
