import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorLearn {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }
        for(Iterator<String> it = list.iterator();((Iterator) it).hasNext();){
            String string = it.next();
            System.out.println(string);
        }

    }
}
