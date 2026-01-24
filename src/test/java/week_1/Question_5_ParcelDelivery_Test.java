package week_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static week_1.Question_5_Parcel_Delivery.calculatePrice;
import static week_1.Question_5_Parcel_Delivery.canShip;

public class Question_5_ParcelDelivery_Test {
    
    @Test(timeout=3000)
    public void testCanShip() {

        // Some valid weights, assuming max is 30
        assertTrue("A parcel weighing 0.1 can be shipped. Return true when the canShip method is called with 0.1", canShip(0.1));
        assertTrue("A parcel weighing 10 can be shipped. Return true when the canShip method is called with 10", canShip(10));
        assertTrue("A parcel weighing 30 can be shipped. Return true when the canShip method is called with 30", canShip(30));


        assertFalse("-1 should not be a valid weight for a parcel. Return false when the canShip method is called with -1", canShip(-1));
        assertFalse("0 should not be a valid weight for a parcel. Return false when the canShip method is called with 0", canShip(0));
        assertFalse("The parcel's weight should not exceed MAX_WEIGHT.  Use the MAX_WEIGHT variable in your method.",
                canShip(Question_5_Parcel_Delivery.MAX_WEIGHT + 0.1));

    }

    @Test(timeout=3000)
    public void testCanShipUsesMAX_WEIGHT() {

        double maxWeightHolder = Question_5_Parcel_Delivery.MAX_WEIGHT;

        Question_5_Parcel_Delivery.MAX_WEIGHT = 10;
        assertFalse("The parcel's weight should not exceed MAX_WEIGHT. Use the global MAX_WEIGHT variable in your method.",
                canShip(Question_5_Parcel_Delivery.MAX_WEIGHT + 0.1));

        Question_5_Parcel_Delivery.MAX_WEIGHT = 100;
        assertTrue("A parcel can be shipped if its weight is less than or equal to MAX_WEIGHT. Use the global MAX_WEIGHT variable in your method.",
                canShip(Question_5_Parcel_Delivery.MAX_WEIGHT - 0.1));

        assertTrue("A parcel can be shipped if its weight is less than or equal to MAX_WEIGHT. Use the global MAX_WEIGHT variable in your method.",
                canShip(Question_5_Parcel_Delivery.MAX_WEIGHT));

        Question_5_Parcel_Delivery.MAX_WEIGHT = maxWeightHolder;

    }

    
    @Test(timeout=3000)
    public void testCalculatePrice() {
    
        /*	Using the rates given in the assignment,
        Between 0 and 10 pounds: $2.15 per pound
        Over 10 and up to 20 pounds: $1.55 per pound
        Over 20 and up to 30 pounds: $1.15 per pound
        */

        double delta = 0.00001; // Numbers must be within this value of each other to be considered the same

        // Between 0 and 10 pounds: $2.15 per pound
        assertEquals("A 0.5 pound parcel should cost " + (0.5 * 2.15),  0.5 * 2.15, calculatePrice(0.5), delta);
        assertEquals("A 5 pound parcel should cost " + (5 * 2.15),  5 * 2.15, calculatePrice(5), delta);
        assertEquals("A 9.99 pound parcel should cost " + (9.99 * 2.15), 9.99 * 2.15, calculatePrice(9.99), delta);
        assertEquals("A 10 pound parcel should cost " + (10 * 2.15), 10 * 2.15, calculatePrice(10), delta);

        // Over 10 and up to 20 pounds: $1.55 per pound

        assertEquals("A 10.1 pound parcel should cost " + (10.1 * 1.55), 10.1 * 1.55, calculatePrice(10.1), delta);
        assertEquals("A 14 pound parcel should cost " + (14 * 1.55),  14 * 1.55, calculatePrice(14), delta);
        assertEquals("A 19.9 pound parcel should cost " + (19.9 * 1.55),  19.9 * 1.55, calculatePrice(19.9), delta);
        assertEquals("A 20 pound parcel should cost " + (20 * 1.55),  20 * 1.55, calculatePrice(20), delta);

        // Over 20 and up to 30 pounds: $1.15 per pound
        assertEquals("A 20.2 pound parcel should cost " + (20.2 * 1.15),  20.2 * 1.15, calculatePrice(20.2), delta);
        assertEquals("A 22 pound parcel should cost " + (22 * 1.15),  22 * 1.15, calculatePrice(22), delta);
        assertEquals("A 29.99 pound parcel should cost " + (29.99 * 1.15),  29.99 * 1.15, calculatePrice(29.99), delta);
        assertEquals("A 30 pound parcel should cost " + (30 * 1.15),  30 * 1.15, calculatePrice(30), delta);

        
    }
}