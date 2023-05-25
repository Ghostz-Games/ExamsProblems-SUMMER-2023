package question1_arealberegning;

//Programmet skal kunne beregne arealet af en firkant og en circle.
//Som bonus skal man lave en Shapes klasse som har en samling af shape objekter. Deri, skal man kunne tilføje flere shapes og udregne den totale area

public class Main {

    public static void main(String[] args){

        //Skaber figurer ud fra shape interfacet:
        Shape s1 = new Square(2,4);
        Shape s2 = new Square(8,2);
        Shape s3 = new Square(4,12);
        Shape s4 = new Circle(8);
        Shape s5 = new Circle(12);
        Shape s6 = new Circle(16);
        Shapes s = new Shapes();

        //Printer resultatet af calculateArea for begge shapes:
        System.out.println(s1.calculateArea());
        System.out.println(s2.calculateArea());

        //Tilføjer alle figuerer til samlingen af figurer:
        s.addShape(s1);
        s.addShape(s2);
        s.addShape(s3);
        s.addShape(s4);
        s.addShape(s5);
        s.addShape(s6);

        //Printer total area:
        System.out.println(s.totalArea());

    }

}
