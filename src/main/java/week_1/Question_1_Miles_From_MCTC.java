package week_1;

import static input.InputUtils.*;

/**
 * Ask the user how many miles they live from MCTC.

 Once the user has typed in their response,

 •	Display "You live more than 10 miles from MCTC" if they live more than 10 miles away,
 •	Display "You live exactly 10 miles from MCTC" if they live exactly 10 miles away,
 •	Display "You live less than 10 miles from MCTC" if they live less than 10 miles away.

 Use if – else if – else statements.

 */
public class Question_1_Miles_From_MCTC {

    public static void main(String[] args) {

        double miles = doubleInput("How many miles do you live from MCTC? ");

        String response = milesFromMCTC(miles);

        System.out.println(response);

    }

    
    public static String milesFromMCTC(double miles){

        // TODO Use if - else if - else statements to return the correct String

        // Return  "You live more than 10 miles from MCTC" if they live more than 10 miles away,
        // Return  "You live exactly 10 miles from MCTC" if they live exactly 10 miles away,
        // Return  "You live less than 10 miles from MCTC" if they live less than 10 miles away.

//        use an if statement to determine if the input (miles) is over 10
        if (miles > 10) {
//            return a statement to display telling the user they live more than 10 miles away
            return "You live more than 10 miles from MCTC";
//            use else if to determine if the input (miles) was less than 10
        } else if (miles < 10) {
//            return a statement to display telling the user they live less than 10 miles away
            return "You live less than 10 miles from MCTC";
//            lastly, use an else statement to run if the input (miles) is exactly 10
        } else {
//            return a statement to display telling the user they live less than 10 miles away
            return "You live exactly 10 miles from MCTC";
        }
    }
    
    
}

