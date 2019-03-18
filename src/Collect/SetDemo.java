package Collect;

import java.util.*;
import java.util.stream.Stream;

public class SetDemo {
    public static void main(String[] args) {
       /* Set setA = new HashSet();

        String element = "element 1";

        setA.add(element);

        Iterator iterator = setA.iterator();
        while(iterator.hasNext()){
            String element2 = (String) iterator.next();
            System.out.println(element2);
        }

        for(Object object : setA) {
            String element3 = (String) object;
            System.out.println(element3);
        }*/

        Set set = new HashSet();
        set.add("one");
        set.add("two");
        set.add("three");

        Stream stream = set.stream();

        stream.forEach((element_1) ->{ System.out.println(element_1); });

       // System.out.println( setA.contains(element) );



       // Set setA = new EnumSet();
        Set setB = new HashSet();
        Set setC = new LinkedHashSet();
        Set setD = new TreeSet();


    }
}
