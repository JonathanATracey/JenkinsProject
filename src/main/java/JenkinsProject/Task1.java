package JenkinsProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;


public class Task1 {

    public static void integerStream() {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(System.out::println);
    }
    public static void createNumbers() {
        List<Integer> num = new ArrayList<>();
        Stream.generate(new Random()::nextInt)
                .limit(20).forEach(num::add);

        System.out.println("Random numbers" + num);

        List<Integer> converted = num.stream().filter(i -> i%2 == 0).toList();

        System.out.println("Even numbers" + converted);

    }

    public static void main(String[] args) {
        integerStream();
        createNumbers();
    }

}


