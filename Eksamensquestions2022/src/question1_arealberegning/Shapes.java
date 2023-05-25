package question1_arealberegning;

import java.util.ArrayList;

public class Shapes {

    private ArrayList<Shape> ArrayOfShapes = new ArrayList<>();


    public void addShape (Shape s){
        ArrayOfShapes.add(s);
    }

    public double totalArea(){
        double output = 0;
        for(Shape s: ArrayOfShapes){
            output += s.calculateArea();
        }
        return output;
    }

}
