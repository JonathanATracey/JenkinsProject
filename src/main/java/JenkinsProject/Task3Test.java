package JenkinsProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Optional;

public class Task3Test {
    @Test
    public void displayNameTest()
    {
        String letter = "A";
        System.out.println(Task3.displayNames(Constants.testList,letter));
        assert(Task3.displayNames(Constants.testList, letter).containsAll((Arrays.asList("abibaba", "amitabh"))));
    }

    @Test
    public void displayMatchAllTest()
    {
        String letter = "S";
        System.out.println(Task3.displayMatchAll(Constants.testList,letter));
        assert(!Task3.displayMatchAll(Constants.testList, letter));
    }

    @Test
    public void displayMatchAllNegativeTest()
    {
        String letter = "Z";
        System.out.println(Task3.displayMatchAll(Constants.testList,letter));
        assert(!Task3.displayMatchAll(Constants.testList, letter));
    }

    @Test
    public void displayMatchAnyTest()
    {
        String letter = "S";
        System.out.println(Task3.displayMatchAny(Constants.testList,letter));
        Assert.assertTrue(Task3.displayMatchAny(Constants.testList, letter));
    }

    @Test
    public void displayMatchAnyNegativeTest()
    {
        String letter = "Z";
        System.out.println(Task3.displayMatchAny(Constants.testList,letter));
        Assert.assertFalse(Task3.displayMatchAny(Constants.testList, letter));
    }

    @Test
    public void displayMatchNoneTest()
    {
        String letter = "H";
        System.out.println(Task3.displayMatchNone(Constants.testList,letter));
        Assert.assertTrue(Task3.displayMatchNone(Constants.testList,letter));
    }

    @Test
    public void displayMatchNoneNegativeTest()
    {
        String letter = "A";
        System.out.println(Task3.displayMatchNone(Constants.testList,letter));
        Assert.assertFalse(Task3.displayMatchNone(Constants.testList,letter));
    }

    @Test
    public void countLetterTest()
    {
        String letter = "A";
        System.out.println(Task3.countLetters(Constants.testList,letter));
        Assert.assertEquals(Task3.countLetters(Constants.testList,letter),3);
    }

    @Test
    public void findLetterTest()
    {
        String letter = "L";
        System.out.println(Task3.findLetter(Constants.testList,letter));
        Assert.assertEquals(Task3.findLetter(Constants.testList,letter), Optional.of("Lokesh"));
    }
}
