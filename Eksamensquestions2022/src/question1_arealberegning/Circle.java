package question1_arealberegning;


//Circle klasse som implementerer shape og overrider calculateArea med Math.PI

public class Circle implements Shape{

    private int radius;


    public Circle(int radius){
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI*(this.radius*this.radius);
    }
}
