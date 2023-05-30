package question10_lommeregner;

public class Main {

    static double[] numbers = {
            1,
            4,
            6,
            7,
            8,
            10,
            4,
            60
    };
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2);
        calculator.add(6);
        calculator.add(7.5);
        calculator.subtract(2.5);

        System.out.println(calculator.getResult());

        calculator.add(numbers);

        System.out.println(calculator.getResult());

        System.out.println(calculator.getExponent(calculator.getResult()));

        System.out.println(calculator.getSqrt(calculator.getResult()));

        calculator.multiply(5);

        System.out.println(calculator.getResult());
    }
}
