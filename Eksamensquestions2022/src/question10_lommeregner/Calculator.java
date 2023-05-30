package question10_lommeregner;

public class Calculator {
    private double result = 0;

    public void add(double x){
        result += x;
    }

    public void subtract(double x){
        result -= x;
    }

    public double getResult() {
        return result;
    }

    public void clear(){
        result = 0;
    }

    public void add(double[] numbers){
        for(double x: numbers){
            result += x;
        }
    }

    public double getExponent(double x){
        return Math.getExponent(x);
    }

    public double multiply(double x){
        return result * x;
    }

    public double getSqrt(double x){
        return Math.sqrt(x);
    }
}
