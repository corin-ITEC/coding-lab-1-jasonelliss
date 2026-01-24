package week_1;

import org.junit.Test;

import static org.junit.Assert.*;
import static week_1.Question_2_Quiz_Question.checkAnswer;


public class Question_2_QuizQuestion_Test {
    
    @Test(timeout=3000)
    public void testQuizChecker() {
        
        String msg = "Return true if the answer is \"Pong\" in any letter case. " +
                "\nIf the answer is anything else, return false. " +
                "\nIn this test, the checkAnswer() method was called with the String \"%s\" and was expected to return %b, but it returned %b.";
        
        String[] correctAnswers = { "Pong", "PONG", "pOnG", "pong"};
        
        String[] incorrectAnswers = { "Asteroids", "qwerty", "P o n g", "Breakout", "tetris"};
        
        for (String answer : correctAnswers) {
            assertTrue(String.format(msg, answer, true, false), checkAnswer(answer));
        }
        
        for (String answer : incorrectAnswers) {
            assertFalse(String.format(msg, answer, false, true), checkAnswer(answer));
        }
        
    }
    
}
