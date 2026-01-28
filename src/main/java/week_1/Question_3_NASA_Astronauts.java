package week_1;

import static input.InputUtils.doubleInput;

/**
 To become a NASA astronaut, you need to be between 58 and 76 inches tall, so you
 are not too tall to fit in the spaceship, but are tall enough to reach all the controls.

 You also need to be able to swim at least 75 yards, in case you make a water
 landing on your return to earth.

 This program asks the user questions about their height and swimming ability.
 It calls a method to check if the user meets NASA's requirements.
 Finish the checkAstronautQualifications method by writing conditional statements
 to determine if the user has potential as a NASA astronaut. The method will return true or false.

 There are many ways of doing this too - once you've written and tested a solution,
 can you think of another way of doing it? Make sure your tests still pass.

 */
public class Question_3_NASA_Astronauts {

    public static void main(String[] args) {

        double height = doubleInput("How tall are you, in inches?");
        double swimDistance = doubleInput("How far can you swim, in yards?");

        boolean astronautPotential = checkAstronautQualifications(height, swimDistance);

        if (astronautPotential) {
            System.out.println("You have astronaut potential!");
        } else {
            System.out.println("Sorry, you don't meet NASA's requirements.");
        }

    }

    public static boolean checkAstronautQualifications(double height, double swimDistance) {

        // TODO check if the height, and swim distance meet NASA's requirements.
        // (The user must be at least 58 inches tall but not more than 76 inches tall,
        // AND they must be able to swim 75 yards or more. )
        // return true if the user meets these qualifications
        // return false otherwise

//        create if statement with the double ampersand to determine if all conditions have been met for height
//        and swimming distance
        if (height >= 58 && height <= 76 && swimDistance >= 75) {
//            if all conditions are met, return true to main function
            return true;
        } else {
//            if any of the conditions are not met, return false to the main function
            return false;


        }

    }
}
