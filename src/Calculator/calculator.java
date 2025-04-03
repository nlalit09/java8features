package Calculator;

@FunctionalInterface
public interface calculator {
    public double add(double first, double second);
    default public double subtract(double first, double second) {
        return first-second;
    }
    static  double multiply(double first, double second) {
        return first*second;
    }
    static double divide(double first, double second) {
        return first/second;
    }
}
