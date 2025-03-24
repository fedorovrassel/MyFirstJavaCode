package ru.my.first;


public class FirstJavaCode {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна: " + s.area());

        Rectangle r = new Rectangle(5, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна: " + r.area());

        Circle c = new Circle(6);
        System.out.println("Площадь круга радиуса " + c.r + " равна: " + c.area());
    }
}