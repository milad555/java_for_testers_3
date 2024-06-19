package ru.stqa.geometry.figures;

public record Triangle(double a, double b, double c) {



    public double trianglePerimeter(){
        return this.a + this.b + this.c;
    }

    public double triangleArea(){
        double halfP = (this.a + this.b + this.c)/2;
        return Math.sqrt(halfP* ( (halfP - this.a) * (halfP - this.b) * (halfP - this.c) ));
    }

    public static void printTrianglePerimeter(Triangle t){
        System.out.println("Triangle perimeter: " + t.trianglePerimeter());
    }

    public static void printTriangleArea(Triangle t){

        System.out.println("Площадь треугольника = " +  String.format("%.2f",t.triangleArea()));
    }
//
//    public static double trianglePerimeter(double a, double b, double c){
//        return a + b + c;
//    }
//
//    public static void printTriangleArea(double a, double b, double c){
//        System.out.println("Площадь треугольника: " + triangleArea(a,b,c));
//    }
//    public static double triangleArea(double a, double b, double c){
//        double halfP = (a + b + c)/2;
//        return  Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
//    }

}
