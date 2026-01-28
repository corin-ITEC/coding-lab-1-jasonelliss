package week_1;

import static input.InputUtils.*;

/**
 To upgrade to Windows 10, a computer needs to have:

 •	Either Windows 7 OR Windows 8 installed   AND
 •	1 GHz or faster processor   AND
 •	2 GB or more RAM

 Finish this program that asks the user for the current version of their
 operating system, the CPU speed, and amount of RAM.

 Use && and || operator in conditions to finish the method that decides if a user
 is able to install Windows 10.
 
 Tip: if your program is failing the tests, check page 74 of Think Java, e-book link here,
 https://books.trinket.io/thinkjava2/chapter5.html#sec63, and/or look up short circuit evaluation.
 */

public class Question_6_Windows_10_Install {

    public static void main(String[] args) {

        String currentOS = stringInput("What is your current operating system?");
        double processorSpeed = doubleInput("What is your current processor speed, in GHz?");
        double ram = doubleInput("How much RAM do you have, in GB?");

        boolean canUpgradeToWindows10 = checkWindows10SystemRequirements(currentOS, processorSpeed, ram);

        if (canUpgradeToWindows10) {
            System.out.println("You can upgrade to Windows 10");
        } else {
            System.out.println("Sorry, you can't upgrade to Windows 10");
        }

    }

    public static boolean checkWindows10SystemRequirements(String currentOS, double processorSpeed, double ram) {

        // TODO write code to check if the computer meets the upgrade requirements.
        // The computer can be upgraded only if ALL the conditions are met.
        // The two valid currentOS values are the exact Strings "Windows 7" or "Windows 8"
        // Return true if the computer can be upgraded
        // Return false if the computer can't be upgraded.

//        use if statement to check conditions
//        we can use the OR method to check for either windows 7 or windows 8 first
//        I used equalsIgnoreCase in case someone does not capitalize Windows
//        once either of those strings have been matched we can move on to make sure processorSpeed is greater than
//        or equal to 1 and the ram is greater than or equal to 2
        if (((currentOS.equalsIgnoreCase("Windows 7") ||
                (currentOS.equalsIgnoreCase("Windows 8"))) && processorSpeed >= 1 && ram >= 2)) {
//            only once all required conditions have been met can we return true to the main function
            return true;
//            if any other string was entered or there is not enough processing speed or ram we return false
        } else {
            return false;

        }

    }
}