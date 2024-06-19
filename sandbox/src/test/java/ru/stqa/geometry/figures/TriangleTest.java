package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void canCalculatePerimeter(){
        Assertions.assertEquals(6, new Triangle(2,2,2).trianglePerimeter());
    }

    @Test
    void canCalculateArea(){
        double value = new Triangle(2,2,2).triangleArea();
        String formattedValue = String.format("%.2f",value);
        double extractDouble = Double.parseDouble(formattedValue);
        Assertions.assertEquals(1.73, extractDouble);
    }

//    void canCalculatePerimeter(){
//       var p = new Triangle(2,2,2);
//        Assertions.assertEquals(6.0, Triangle.trianglePerimeter());
//    }

}
