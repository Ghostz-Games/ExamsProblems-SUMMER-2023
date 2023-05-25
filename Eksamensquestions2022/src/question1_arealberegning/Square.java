package question1_arealberegning;

//Firkant klasse som implementerer shape interfacet. Noter, at calculateArea funktionen er her, og bliver overrided.

public class Square implements Shape{

    private int height;
    private int length;

    public Square(int height, int length){
        this.height = height;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return height*length;
    }
}
