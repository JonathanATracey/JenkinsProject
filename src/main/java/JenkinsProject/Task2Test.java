package JenkinsProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2Test {
    @Test
    public void checkAllElements()
    {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < 10; i++)
        {
            list.add(i);
        }

        Integer[] listToTest = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(Task2.collectAllElements(list)));

        Assert.assertEquals(Task2.collectAllElements(list),listToTest);
    }

    @Test
    public void checkSortedLetters()
    {
        List<String> myList2 = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        Assert.assertEquals(Arrays.asList("C1", "C2"), Task2.collectLetter(myList2));
    }

    @Test
    public void checkSortedLetters2()
    {

        List<String> myList2 = Arrays.asList("a1", "a2", "b1", "c2", "c1", "c3","c0");


        Assert.assertEquals(Arrays.asList("C0","C1","C2","C3"), Task2.collectLetter(myList2));

    }

    @Test
    public void checkSortedLetters3()
    {

        List<String> myList2 = Arrays.asList("a1", "a2", "b1", "2C", "c1");


        Assert.assertEquals(Arrays.asList("C1"), Task2.collectLetter(myList2));

    }
}
