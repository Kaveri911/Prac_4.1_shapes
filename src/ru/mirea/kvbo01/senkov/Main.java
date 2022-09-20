package ru.mirea.kvbo01.senkov;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Shape Rect=new Rectangle(10,20);
        System.out.println(Rect.getType()+" "+Rect);
        System.out.println("Площадь= "+Rect.getArea()+" Периметр = "+Rect.getPerimetr());
        Shape Sqr=new Square(5);
        System.out.println(Sqr.getType()+" "+Sqr);
        System.out.println("Площадь= "+Sqr.getArea()+" Периметр = "+Sqr.getPerimetr());
        Shape Cir=new Circle(2);
        System.out.println(Cir.getType()+" "+Cir);
        System.out.println("Площадь= "+Cir.getArea()+" Периметр = "+Cir.getPerimetr());



    }
}
