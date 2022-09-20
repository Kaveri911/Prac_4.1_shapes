package ru.mirea.kvbo01.senkov;

public class Rectangle extends Shape
{
     protected double width;
     protected double length;
     public Rectangle(double width,double length, String color, boolean filled)
     {
         this.width = width;
         this.length = length;
         this.color=color;
         this.filled=filled;

     }

    public double getArea ()
     {
         return this.width *this.length;
     }

    @Override
    public double getPerimetr() {
        return this.width +this.length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getType() {
        return "Это прямоугольник!";
    }


}
