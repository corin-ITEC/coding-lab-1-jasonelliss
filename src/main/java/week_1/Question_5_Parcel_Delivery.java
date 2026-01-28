package week_1;

import static input.InputUtils.doubleInput;

/**
 *
 * A parcel delivery company charges the following rates to ship a parcel.
 
 •	Up to and including 10 pounds: $2.15 per pound
 •	Up to and including 20 pounds: $1.55 per pound
 •	Up to and including 30 pounds: $1.15 per pound
 
 The shipping company does not ship parcels that weigh over 30 pounds.
 
 So, a parcel that weighs 17 pounds will cost $1.55 x 17 = $26.35.
 
 Write a program that asks the user for the weight of a parcel and displays
 whether it can be shipped, and what it will cost.
 
 Optional extra: the most obvious solution to this problem uses if statements
 for the price bands. Can you think of a different way?
 Hint – loops and arrays of price and max weights for price?
 
 */

public class Question_5_Parcel_Delivery {
    
    public static double MAX_WEIGHT = 30;   // Use this in the canShip method
    
    public static void main(String[] args) {
        
        // Don't modify the code in this method.
        
        double weight = doubleInput("Enter weight of parcel");
        
        boolean canShip = canShip(weight);
        
        if (canShip) {
            double price = calculatePrice(weight);
            System.out.printf("It will cost %.2f to send your %.2f pound parcel.", price, weight);
        } else {
            System.out.printf("A parcel that weighs %.2f pounds can't be shipped.", weight);
        }
    }
    
    
    public static boolean canShip(double weight) {
        // TODO return false if parcel weight is 0 or less
        // TODO return false if parcel weight is more than MAX_WEIGHT. Use the MAX_WEIGHT variable in this code
        // TODO return true if the parcel weight is more than 0 and less than or equal to MAX_WEIGHT. Use the MAX_WEIGHT variable in this code

//        use if statement to determine if the weight is under the max weight and more than 0
//        we use the or || condition to check if either if these is the case
        if (weight > MAX_WEIGHT || weight <= 0) {
//            if the package is either too heavy or 0 we return false
            return false;
        } else {
//            if the package is within the weight parameters we return true
            return true;
        }
    }
    
    
    public static double calculatePrice(double weight) {

        // TODO assume parcel is a valid weight. Figure out price to ship this parcel.
        //  If the parcel is not a valid weight, return 0.

        //  Parcel price rates:
        //  Up to and including 10 pounds: $2.15 per pound
        //  Up to and including 20 pounds: $1.55 per pound
        //  Up to and including 30 pounds: $1.15 per pound

        // To calculate the price, multiply the weight by the price for that weight.
        // For example, for a 15 pound parcel, the weight variable will be 15. The price rate is 1.55 per pound (up to and including 20 pounds)
        // So the price is 15 * 1.55 = 23.25.

//        use an if statement to determine if weight is less than or equal to 10 pounds
        if (weight <= 10) {
//            if weight is in first pricing category multiply the weight by price per pound
            return weight * 2.15;
//            use else if statement that will run if first condition is not met to check between 11 and 20 pounds
        } else if (weight <= 20) {
//            multiply weight by appropriate price per pound
            return weight * 1.55;
//            second else if statement if first two conditions are not met check for packages between 21 and 30
        } else if (weight <= 30) {
//            multiple weight by appropriate price per pound
            return weight * 1.15;
//            last statement is for any non-valid weight
        } else {
//            return 0 for invalid weights
            return 0;
        }

    }
    
    
}