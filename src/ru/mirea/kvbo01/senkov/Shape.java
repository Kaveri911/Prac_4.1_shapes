package ru.mirea.kvbo01.senkov;

public abstract class Shape {
    protected String color;
    protected boolean filled;
public abstract String getType();
public abstract double getArea();
public abstract double getPerimetr();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
