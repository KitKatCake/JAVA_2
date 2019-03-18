package Stre;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
//        List<String> items = new ArrayList<String>();
//
//        items.add("one");
//        items.add("two");
//        items.add("three");
//
//        Stream<String> stream = items.stream();
//
//        stream.forEach((element)->{
//            System.out.println(element);
//        });



        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        //Stream<String> stream = stringList.stream();


//        long count = stream
//                .map((value) -> { return value.toLowerCase(); })
//                .count();
//        System.out.println(count);


       // stream.map(value->value.toLowerCase()).forEach(System.out::println);


   //     stringList.stream().map(value->value.toLowerCase()).forEach(System.out::println);




        List<String> stringList2 = new ArrayList<String>();
        stringList2.add("One flew over the cuckoo's nest");
        stringList2.add("To kill a muckingbird");
        stringList2.add("Gone with the wind");

        Stream<String> stream1 = stringList2.stream();

        List<String> stringList3 = new ArrayList<>();
        stringList3.add("Lord of the Rings");
        stringList3.add("Planet of the Rats");
        stringList3.add("Phantom Menace");

        Stream<String> stream2 = stringList3.stream();

        Stream<String> concatStream = Stream.concat(stream1, stream2);

        List<String> stringsAsUppercaseList = concatStream
                .collect(Collectors.toList());

        stringsAsUppercaseList.forEach(System.out::println);




    }
}
