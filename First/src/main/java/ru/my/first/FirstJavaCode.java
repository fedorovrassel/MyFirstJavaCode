package ru.my.first;


public class FirstJavaCode {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна: " + s.area());

        Rectangle r = new Rectangle(5, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна: " + r.area());

        Circle c = new Circle(6);
        System.out.println("Площадь круга радиуса " + c.r + " равна: " + c.area());

        Point p1 = new Point(1, 1);
        Point p2 = new Point(0, 0);
        System.out.println("Расстояние между точками P1(" + p1.x + ", " + p1.y + ") и P2(" + p2.x + ", " + p2.y + ") равно: " + p1.distance(p1, p2));
    }
}