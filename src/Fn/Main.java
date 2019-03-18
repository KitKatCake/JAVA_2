package Fn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main implements MyFunctionalInterface2 {
    public static void main(String[] args) {

//        Function<Long, Long> adder = new AddThree();
//        Long result = adder.apply((long) 4);
//        System.out.println("result = " + result);

        Predicate<String> startsWithA = (text) -> text.startsWith("A");
        Predicate<String> endsWithX   = (text) -> text.endsWith("x");
//
//        Predicate<String> startsWithAAndEndsWithX =
//                (text) -> startsWithA.test(text) && endsWithX.test(text);
//
//        String  input  = "A hardworking person must relax";
//        boolean result = startsWithAAndEndsWithX.test(input);
//        System.out.println(result);



//        Predicate<String> composed = startsWithA.or(endsWithX);
        Predicate<String> composed = startsWithA.and(endsWithX);

        String input = "A hardworking person must relax sometimes";
        boolean result = composed.test(input);
        System.out.println(result);


//        Function<Integer, Integer> multiply = (value) -> value * 2;
//        Function<Integer, Integer> add      = (value) -> value + 3;
//
//        Function<Integer, Integer> addThenMultiply = multiply.compose(add);
//
//        Integer result1 = addThenMultiply.apply(3);
//        System.out.println(result1);

        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add      = (value) -> value + 3;

        Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);

        Integer result2 = multiplyThenAdd.apply(3);
        System.out.println(result2);



        Main main = new Main();
        main.execute();

        main.print1("This is default method");

        main.print1("This is static method");


    }

    @Override
    public void execute() {
        System.out.println("Execute");
    }

}
