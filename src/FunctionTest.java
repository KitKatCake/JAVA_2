import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        int i2 = functionTest.add2(2);
        int i3 = functionTest.add3(2);
        int i4 = functionTest.add4(2);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        int result2 = functionTest.compute(2, num -> num + 2);
        int result3 = functionTest.compute(2, num -> num + 3);
        int result4 = functionTest.compute(2, num -> num + 4);
        int results = functionTest.compute(5, num -> num * num);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(results);


    }
    public int add2(int i){
        return i+2;
    }
    public int add3(int i){
        return i + 3;
    }
    public int add4(int i){
        return i + 4;
    }
    public int compute(int i, Function<Integer,Integer>function){
        Integer result = function.apply(i);
        return result;
    }


}
