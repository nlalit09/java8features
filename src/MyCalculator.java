
public class MyCalculator implements functionalInterface{

//    @Override
//    public double sqroot(int num){
//        return Math.sqrt(num);
//    }
//

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        int sum= myCalculator.calculate(1,2);
        double root=myCalculator.sqroot(25);
        System.out.println(root);
    }

    @Override
    public double sqroot(int a) {
        return 0;
    }

    @Override
    public int calculate(int a, int b) {
        return functionalInterface.super.calculate(a, b);
    }
}
