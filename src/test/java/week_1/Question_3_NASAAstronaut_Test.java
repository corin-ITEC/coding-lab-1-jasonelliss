package week_1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class Question_3_NASAAstronaut_Test {
    
    @Test(timeout=3000)
    public void testAstronautQualificationsSwimOKHeightTooShort() {

        // Swim ok, but too short...
        assertFalse("Height = 40, swim = 80 should return false", Question_3_NASA_Astronauts.checkAstronautQualifications(40, 80));
    }


    @Test(timeout=3000)
    public void testAstronautQualificationsSwimOKHeightTooTall() {

        // Swim ok, but too tall...
        assertFalse("Height = 90, swim = 80 should return false", Question_3_NASA_Astronauts.checkAstronautQualifications(90, 80));
        assertFalse("Height = 77, swim = 80 should return false", Question_3_NASA_Astronauts.checkAstronautQualifications(77, 80));

    }

    @Test(timeout=3000)
    public void testAstronautQualificationsSwimShortHeightOK() {

        // Height ok, need to swim further...
        assertFalse("Height = 60, swim = 50 should return false", Question_3_NASA_Astronauts.checkAstronautQualifications(60, 50));
        assertFalse("Height = 60, swim = 74 should return false", Question_3_NASA_Astronauts.checkAstronautQualifications(60, 74));

    }

    @Test(timeout=3000)
    public void testAstronautQualificationsSwimShortHeightShort() {

        // Height too short, swim too short
        assertFalse("Height = 40, swim = 50 should return false", Question_3_NASA_Astronauts.checkAstronautQualifications(40, 50));

    }

    @Test(timeout=3000)
    public void testAstronautQualificationsSwimShortHeightTooTall() {

        // Height too tall, swim too short
        assertFalse("Height = 80, swim = 50 should return false", Question_3_NASA_Astronauts.checkAstronautQualifications(80, 50));

    }

    @Test(timeout=3000)
    public void testAstronautQualificationsSwimOKHeightOK() {

        // Exact swim, height ok
        assertTrue("Height = 60, swim = 75 should return true", Question_3_NASA_Astronauts.checkAstronautQualifications(60, 75));

        // Exceed swim, height ok
        assertTrue("Height = 60, swim = 90 should return true", Question_3_NASA_Astronauts.checkAstronautQualifications(60, 90));


        // Exceed swim, height at minimum
        assertTrue("Height = 58, swim = 90 should return true", Question_3_NASA_Astronauts.checkAstronautQualifications(58, 90));

        // Exceed swim, height at max
        assertTrue("Height = 76, swim = 90 should return true", Question_3_NASA_Astronauts.checkAstronautQualifications(76, 90));

    }
    
}
