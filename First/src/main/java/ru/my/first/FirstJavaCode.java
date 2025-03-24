package ru.my.first;


public class FirstJavaCode {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна: " + area(s));

        Rectangle r = new Rectangle(5, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна: " + area(r));
    }

    public static int area(Square s) {
        return s.l * s.l;
    }

    public static int area(Rectangle r) {
        return r.a * r.b;
    }
}