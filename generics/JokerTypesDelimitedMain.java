package generics;

import generics.model.Circle;
import generics.model.Rectangle;
import generics.model.Shape;

import java.util.ArrayList;
import java.util.List;

public class JokerTypesDelimitedMain {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: "+ totalArea(myShapes));
    }

    public static double totalArea(List<Shape> list){
        double sum = 0.0;
        for(Shape shape : list){
            sum += shape.area();
        }
        return sum;
    }
}
