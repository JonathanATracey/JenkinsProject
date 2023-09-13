package JenkinsProject;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5Test {


    @Test
    public void positive_onlyLetters_test() {
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));

        assert(Task5.onlyLetters(people).toString()).equals("[d, s, a, z]");
    }

    @Test
    public void mixed_onlyLetters_test() {
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555Kn-1123","s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("F555-2243","z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "D6"));

        assert(Task5.onlyLetters(people).toString()).equals("[D, K, n, s, a, F, z]");
    }

    @Test
    public void noLetters_onlyLetters_test() {
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","1", "555-3389", "7"));
        people.put("Mary", Arrays.asList("555-2243","6", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "7"));

        assert(Task5.onlyLetters(people).toString()).equals("[]");
    }

    @Test
    public void emptyMap_onlyLetters_test() {
        Map<String, List<String>> people = new HashMap<>();

        assert(Task5.onlyLetters(people).toString()).equals("[]");
    }

}