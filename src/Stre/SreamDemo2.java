package Stre;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SreamDemo2 {
    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<String>();
//
//        stringList.add("One flew over the cuckoo's nest");
//        stringList.add("To kill a muckingbird");
//        stringList.add("Gone with the wind");
//
//        Stream<String> stream = stringList.stream();
//
//        Optional<String> reduced = stream.reduce((value, combinedValue) -> {
//            return combinedValue + " + " + value;
//        });
//
//
//        System.out.println(reduced.get());

        //max

//        List<String> stringList = new ArrayList<String>();
//
//        stringList.add("abc");
//        stringList.add("def");
//
//        Stream<String> stream = stringList.stream();
//
//        Optional<String> max = stream.max((val1, val2) -> {
//            return val1.compareTo(val2);
//        });
//
//        String maxString = max.get();
//
//        System.out.println(maxString);



        //findany

//        List<String> stringList = new ArrayList<String>();
//
//        stringList.add("one");
//        stringList.add("two");
//        stringList.add("three");
//        stringList.add("one");
//
//        Stream<String> stream = ;
//
//        Optional<String> anyElement = stringList.stream().findAny();
//
//        System.out.println(anyElement.get());



        //distinct


//        List<String> stringList = new ArrayList<String>();
//
//        stringList.add("one");
//        stringList.add("two");
//        stringList.add("three");
//        stringList.add("one");
//
//        stringList.stream()
//                .distinct()
//                .collect(Collectors.toList()).forEach(System.out::println);




        //limit

//        List<String> stringList = new ArrayList<String>();
//
//        stringList.add("one");
//        stringList.add("two");
//        stringList.add("three");
//        stringList.add("one");
//
//        stringList.stream().limit(2).forEach( element -> { System.out.println(element); });



        //map

//        List<String> list = new ArrayList<String>();
//
//        list.stream().map((value) -> value.toUpperCase()).forEach(System.out::println);



        //filter

//        List<String> list = new ArrayList<String>();
//
//         list.stream().filter((value) -> {
//            return value.length() >= 3;
//        });


//        Function<Integer, Integer> multiply = (value) -> value * 2;
//        Function<Integer, Integer> add      = (value) -> value + 3;
//
//        Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);
//
//        Integer result2 = multiplyThenAdd.apply(3);
//        System.out.println(result2);

        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add      = (value) -> value + 3;

        Function<Integer, Integer> addThenMultiply = multiply.compose(add);

        Integer result1 = addThenMultiply.apply(3);
        System.out.println(result1);







    }
}
