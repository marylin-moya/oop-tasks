import java.util.ArrayList;
import java.util.List;

public class StringPractice
{

    public static void main(String[] args)
    {
        List<String> test = new ArrayList<>();
        test.add("Bolivia");
        test.add("Argentina");
        test.add("Argelia");
        test.add("Portugal");
        test.add("Italia");
        test.add("Australia");

        System.out.println("--------------Exercise 1--------------");
        test.stream()
        .filter(value -> value.toLowerCase().startsWith("a"))
        .forEach(value -> System.out.println(value));

        System.out.println("--------------Exercise 2--------------");
        test.stream()
        .filter(value -> value.length() > 5)
        .forEach(value -> System.out.println(value));

        System.out.println("--------------Exercise 3--------------");
        test.stream()
        .filter(value -> value.length() % 2 == 0)
        .forEach(value -> System.out.println(value));
    }
}
