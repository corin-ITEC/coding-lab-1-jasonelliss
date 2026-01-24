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
        
        // TODO replace this line with your own code
        return false;
    }
    
}

