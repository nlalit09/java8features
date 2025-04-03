package Calculator;

import java.util.function.BiFunction;

public class MyCalculator implements calculator{


    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double subtract(double first, double second) {
        return calculator.super.subtract(first, second);
    }

    public static Integer evaluate(Integer t, Integer u, BiFunction<Integer, Integer, Integer> fn) {
        return fn.apply(t, u);
    }

    public static void main(String[] args){
        System.out.println(new MyCalculator().subtract(2,3));
        System.out.println(new MyCalculator().add(2,3));
        System.out.println(calculator.multiply(2,3));
        System.out.println(calculator.divide(2,3));

        System.out.println(evaluate(1,2,(a,b)->a+b));
        System.out.println(evaluate(1,2,(a,b)->a*b));
    }


}
