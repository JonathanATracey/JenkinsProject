package JenkinsProject;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4Test {
    @Test
    public void noDuplicatesTest()
    {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(4,1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));

        List<Integer> checkList = new ArrayList<>(Arrays.asList(4,1,2,3,5,6,7));

        System.out.println(Task4.removeDuplicates(numbersList));

        assert(Task4.removeDuplicates(numbersList).equals(checkList));
    }

    @Test
    public void noDuplicatesSecondTest()
    {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 1, 1));

        List<Integer> checkList = new ArrayList<>(List.of(1));

        System.out.println(Task4.removeDuplicates(numbersList));

        assert(Task4.removeDuplicates(numbersList).equals(checkList));
    }
}
