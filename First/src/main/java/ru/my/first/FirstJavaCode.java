package ru.my.first;


public class FirstJavaCode {
    public static void main(String[] args) {
        System.out.println(test("Hello", "World"));
    }
    public static String test (String l, String b) {
        return (l + ", " + b + "!");
    }
}