package week_1;

import static input.InputUtils.stringInput;

/**
 *
 * Finish the method that checks if the answer to the quiz question is correct.
 *
 * You should accept answers in any case, but the spelling and spacing must be correct.
 *
 * (Tip: the answer is "Pong" https://en.wikipedia.org/wiki/Pong)
 *
 */

public class Question_2_Quiz_Question {

    public static void main(String[] args) {

        System.out.println("Quiz time!");
        System.out.println("What is the name of the classic 1972 arcade game based on table tennis?");
        String answer = stringInput("Enter your answer: ");

        boolean correct = checkAnswer(answer);

        if (correct) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Sorry, the answer is Pong.");
        }

    }

    public static boolean checkAnswer(String answer) {

        // TODO check that the user's answer is "Pong" in any letter case.
        // Case doesn't matter, so "pong" or "PONG" or any other variation in case is the correct answer.
        // Remember that using == to compare Strings may not do what you expect it to do!

//        use an if statement to check if the answer provided matches the string Pong, use
//        equalsIgnoreCase so that it does not check for capitilization
        if (answer.equalsIgnoreCase("Pong")) {
//            if the answer matches the string pong we return true for the boolean in the main program and tell the
//            user the answer was correct
            return true;
//            else is used for anything other than the string pong
        } else {
//            we return false for the boolean triggering the statement to say the answer was wrong
            return false;
        }

    }
}
