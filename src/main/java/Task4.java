import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static String [] flatLists(List<Integer> l1, List<Integer> l2, List<Integer> l3)
    {
        List<List<Integer>> flatLists = Arrays.asList(l1,l2,l3);

        List<Integer> flattened = flatLists.stream().flatMap(Collection::stream).toList();

        System.out.println(flattened);

        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};

        return Stream.of(dataArray)
                .flatMap(Arrays::stream)
                .toArray(String[]::new);
    }

    public static List<Integer> removeDuplicates(List<Integer> noDuplicates)
    {
        return noDuplicates.stream().distinct().toList();
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        System.out.println(Arrays.toString(flatLists(list1, list2, list3)));

        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(4,1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));

        System.out.println(removeDuplicates(numbersList));
    }
}

