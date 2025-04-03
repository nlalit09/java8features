@FunctionalInterface
public interface functionalInterface {

    public double sqroot(int a);
    //public double sqr(int a);
    default int calculate(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b) {
        return a + b;
    }
}
