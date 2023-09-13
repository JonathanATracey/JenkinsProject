
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static Integer[] collectAllElements(List<Integer> numList)
    {
        return numList.toArray(Integer[]::new);
    }

    public static List<String> collectLetter(List<String> letterList)
    {

        return letterList.stream().
                filter(value -> value.startsWith("c")).map(String::toUpperCase)
                .sorted().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < 10; i++)
        {
            list.add(i);
        }

        System.out.println(Arrays.toString(collectAllElements(list)));

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        System.out.println(collectLetter(myList));
    }
}
