package week_1;

import static input.InputUtils.yesNoInput;

/**
 * USPS charges 49c to mail a rectangular, flat letter. These letters can
 be automatically processed by USPS mail-sorting machines.

 USPS charges an extra 21c to mail a non-machinable letter,
 which are letters that can't be processed by their mail-sorting machines.

 Rectangular letters can be processed by machine. Square, circular or other
 shaped letters can't be processed by machine.

 Letters must be flat to be processed by machine. Letters that are not flat
 (with bumps or have a curved shape) can't be processed by machine.

 Write a letter mailing price calculating program.

 This program asks user what shape their letter is - rectangular or not
 Ask the user if their letter is flat or not

 Finish the method to calculate the cost to mail the letter.
 Use the two variables MACHINABLE_LETTER_PRICE and NON_MACHINABLE_SURCHARGE
 in the method.

 */


public class Question_4_Mail_Prices {

    // TODO Use these values in the calculateStampPrice method to
    //  calculate the total price to mail the letter.
    public static int MACHINABLE_LETTER_PRICE = 49;
    public static int NON_MACHINABLE_SURCHARGE = 21;


    public static void main(String[] args) {

        boolean isRectangular = yesNoInput("Is the letter rectangular?");
        boolean isFlat = yesNoInput("Is the letter flat?");

        // Calculate price, in cents
        int price = calculateStampPrice(isRectangular, isFlat);

        System.out.println("Your letter will cost " + price + " cents to mail.");

        // Optional - if preferred, display the price as dollars and cents.

    }


    /* Calculate and return the price, in cents, to mail the letter.  */

    public static int calculateStampPrice(boolean isRectangle, boolean isFlat) {

        /* TODO Calculate and return the price, in cents, to mail the letter.
        * Use the two boolean parameter variables, isRectangle and isFlat to figure out the price.
        * Use the MACHINABLE_LETTER_PRICE and NON_MACHINABLE_SURCHARGE variables declared
        * at the top of the file, which contain the current prices for mailing machinable letters,
        * and the current non-machinable surcharge.
        */

        //TODO delete this line and replace with your own code
        return 0;   // This is the wrong answer, but Java requires us to return something.

    }
    
  
}



