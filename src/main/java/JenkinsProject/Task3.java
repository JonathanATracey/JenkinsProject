package JenkinsProject;

import JenkinsProject.Constants;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task3 {
    public static List<String> displayNames(List<String> list, String c)
    {
        return list.stream().filter(i -> i.startsWith(c))
                .filter(i -> i.length() > 5)
                .map(String::toLowerCase)
                .sorted().collect(Collectors.toList());
    }

    public static Boolean displayMatchAll(List<String> list, String c)
    {

        return list.stream().allMatch(i -> i.contains(c));
    }

    public static Boolean displayMatchAny(List<String> list, String c)
    {

        return list.stream().anyMatch(i -> i.contains(c));
    }

    public static Boolean displayMatchNone(List<String> list, String c)
    {
        return list.stream().noneMatch(i -> i.contains(c));
    }

    public static long countLetters(List<String> list, String c)
    {
        return list.stream().filter(e -> e.startsWith(c)).count();
    }

    public static Optional<String> findLetter(List<String> list, String c)
    {
        return list.stream().filter(i -> i.startsWith(c)).findFirst();
    }


    public static void main(String[] args) {
        System.out.println(displayNames(Constants.testList,"A"));
        System.out.println(displayMatchAny(Constants.testList,"S"));
        System.out.println(displayMatchNone(Constants.testList,"H"));
        System.out.println(countLetters(Constants.testList,"A"));
        System.out.println(findLetter(Constants.testList,"L"));
    }
}

