package Test;

public class Main {
    public static void main(String[] args) {
        Derived obj = new Derived();

        System.out.println(obj.f(3));
        System.out.println(obj.f(3.3));

    }
}
