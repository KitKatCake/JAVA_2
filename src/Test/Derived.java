package Test;

public class Derived extends Base {
    public double f(double i)
    {
        System.out.println("f (double): ");
        return i+3.3;
    }
}
