package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side) {
        System.out.println(text(side));
    }

    private static String text(double side) {
        return String.format("Площадь квадрата со стороной %f = %f",  side,  squareArea(side));
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
