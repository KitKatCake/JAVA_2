import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","helloworld");

        for(int i=0;i<list.size();i++){
            if(list.get(i).length()>5){
                System.out.println(list.get(i).toUpperCase());
            }
        }
        list.stream().filter(s->s.length()>5).map(s->s.toUpperCase()).forEach(System.out::println);
        list.stream().filter(s -> s.length() > 5).map(String::toUpperCase).forEach(System.out::println);

    }
}
