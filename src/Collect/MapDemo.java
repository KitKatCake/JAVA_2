package Collect;

import java.util.*;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        Map mapA = new HashMap();
        mapA.put("key1", "value1");
        mapA.put("key2", "value2");

        Map mapB = new HashMap();
        mapB.putAll(mapA);

//        String element1 = (String) mapA.get("key1");
//
//        System.out.println(element1);

        boolean a = mapA.containsKey("key1");

        System.out.println(a);

//        Iterator iterator = mapB.keySet().iterator();
//        while(iterator.hasNext()){
////            Object key   = iterator.next();
//            var key   = iterator.next();
////            Object value = mapA.get(key);
//            var value = mapA.get(key);


//            for(Object key : mapA.keySet()) {
//                Object value = mapA.get(key);
//                System.out.println(key+":"+value);
//
//            }

//        mapA.put("D", null);
//
//
//        Map<String, String> map = new HashMap<>();
//
//        map.put("one", "first");
//        map.put("two", "second");
//        map.put("three", "third");
//
//        map.keySet().stream().forEach((value) -> {
//            System.out.println(value);
//        });
//        map.keySet().stream().forEach(System.out::println);
//
//        System.out.println(mapA.get("D"));





        //Using an Entry Iterator


//        Set entries = mapA.entrySet();
//        Iterator iterator = entries.iterator();
//        while(iterator.hasNext()) {
//            Map.Entry entry = (Map.Entry) iterator.next();
//            Object key = entry.getKey();
//            Object value = entry.getValue();
//
//            System.out.println(key+":"+value);
//        }



        //Using an Entry For-Each Loop

//        for(Object entryObj : mapA.entrySet()){
//            Map.Entry entry = (Map.Entry) entryObj;
//            Object key = entry.getKey();
//            Object value = entry.getValue();
//            System.out.println(key+":"+value);
//        }

      //  Replacing an Entry in a Java Map

        Map map = new HashMap();

//        map.replace("key", "new value");
//
//        map.put("key", "value");
//
//        map.replace("key", "newer value");
//
//        int entryCount = mapA.size();
//
//        System.out.println(entryCount);



//        String Str = new String("www.runoob.com");
//
//        System.out.print("返回值 :" );
//        System.out.println(Str.startsWith("www") );
//
//        System.out.print("返回值 :" );
//        System.out.println(Str.startsWith("runoob") );
//
//        System.out.print("返回值 :" );
//        System.out.println(Str.startsWith("runoob", 4) );


   //     System.out.println(map.values());


        List<String> items = new ArrayList<String>();

        items.add("one");
        items.add("two");
        items.add("three");

        Stream<String> stream = items.stream();

        stream.filter( item -> item.startsWith("tw")).forEach(System.out::println);




    }

}


