import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        PredicateTest predicateTest = new PredicateTest();
        List<Integer> result = predicateTest.conditionalFilter(list, integer -> integer > 5);
        result.forEach(System.out::println);
        System.out.println("-------");

        result = predicateTest.conditionalFilter(list, integer -> integer >= 5);
        result.forEach(System.out::println);
        System.out.println("-------");

        result = predicateTest.conditionalFilter(list, integer -> integer < 8);
        result.forEach(System.out::println);
        System.out.println("-------");

        result = predicateTest.conditionalFilter(list, integer -> true);
        result.forEach(System.out::println);
        System.out.println("-------");

        result = predicateTest.conditionalFilterAnd(list, integer -> integer > 5, integer1 -> integer1 % 2 == 0);
        result.forEach(System.out::println);
        System.out.println("-------");

        result = predicateTest.conditionalFilterOr(list, integer -> integer > 5, integer1 -> integer1 % 2 == 0);
        result.forEach(System.out::println);//2 4 6 8 9 10
        System.out.println("-------");

        result = predicateTest.conditionalFilterNegate(list,integer2 -> integer2 > 5);
        result.forEach(System.out::println);// 1 2 3 4 5
        System.out.println("-------");







    }
    public List<Integer> conditionalFilter(List<Integer> list,Predicate<Integer> predicate){
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

    public List<Integer> conditionalFilterNegate(List<Integer> list, Predicate<Integer> predicate){
        return list.stream().filter(predicate.negate()).collect(Collectors.toList());
    }

    public List<Integer> conditionalFilterAnd(List<Integer> list, Predicate<Integer> predicate,Predicate<Integer> predicate2){
        return list.stream().filter(predicate.and(predicate2)).collect(Collectors.toList());
    }
    public List<Integer> conditionalFilterOr(List<Integer> list, Predicate<Integer> predicate,Predicate<Integer> predicate2){
        return list.stream().filter(predicate.or(predicate2)).collect(Collectors.toList());
    }

}
