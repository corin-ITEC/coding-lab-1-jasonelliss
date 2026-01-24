package week_1;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class Question_1_MilesFromMCTC_Test {
    
    @Test(timeout=3000)
    public void testMethodDoesNotReturnNull() {
        // Test that the "return null" statement was removed
        assertNotNull("Remove the 'return null' statement from the milesFromMCTC method, and replace with your own code", Question_1_Miles_From_MCTC.milesFromMCTC(0));

    }
    
    @Test(timeout=3000)
    public void testMilesFromMCTC() {

        // Strings that are expected to be in the program output
        String less = "less than 10 miles";
        String more = "more than 10 miles";
        String equal = "exactly 10 miles";


        // Test with miles less than 10

        // Call method with example data - in this case, 6 miles
        String result = Question_1_Miles_From_MCTC.milesFromMCTC(6);
        // The result should contain the text "less than 10 miles".
        // Case is not important, so convert to lower case
        assertNotNull("Replace the return null; statement with your code", result);
        String resultLowerCase = result.toLowerCase();
        // Does the resultLowerCase string contain the expected text?
        boolean containsText = resultLowerCase.contains(less);

        // Assert that containText is true, if the method is working correctly
        // The message is printed if the test fails
        assertTrue("If user lives less than 10 miles away, should print a message including the text '" + less + "'", containsText);


        // Or squish the previous 4 lines of code into one line :)

        // Test with miles equal to 10
        assertTrue("If user lives exactly 10 miles away, should print a message including the text '" + equal + "'", Question_1_Miles_From_MCTC.milesFromMCTC(10).toLowerCase().contains(equal));

        // Test with miles greater than 10
        assertTrue("If user lives more than 10 miles away, should print a message including the text '" + more + "'", Question_1_Miles_From_MCTC.milesFromMCTC(15).toLowerCase().contains(more));

        // Test with 0
        assertTrue("If user lives 0 miles away, should print a message including the text '" + less + "'",  Question_1_Miles_From_MCTC.milesFromMCTC(0).toLowerCase().contains(less));

        // Test with negative number
        assertTrue("If user lives a negative number of miles away, should print a message including the text '" + less + "'", Question_1_Miles_From_MCTC.milesFromMCTC(-6).toLowerCase().contains(less));

        // Test with very large number
        assertTrue("If user lives more than miles away, should print a message including the text '" + more + "'", Question_1_Miles_From_MCTC.milesFromMCTC(600000).toLowerCase().contains(more));

    }

}
