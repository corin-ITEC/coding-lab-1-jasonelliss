package week_1;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class Question_4_MailPrices_Test {
    
    @Test(timeout=3000)
    public void testCalculateStampPriceRectFlat() {
        assertEquals("Rectangular, flat letters should cost 49c", 49, Question_4_Mail_Prices.calculateStampPrice(true, true));
    }

    @Test(timeout=3000)
    public void testCalculateStampPriceRectNotFlat() {
        assertEquals("Rectangular, not-flat letters should cost 70c", 70, Question_4_Mail_Prices.calculateStampPrice(true, false));
    }

    @Test(timeout=3000)
    public void testCalculateStampPriceNotRectFlat() {
        assertEquals("Non-rectangular, flat letters should cost 70c", 70, Question_4_Mail_Prices.calculateStampPrice(false, true));
    }

    @Test(timeout=3000)
    public void testCalculateStampPriceNotRectNotFlat() {
        assertEquals("Non-rectangular, not-flat, letters should cost 70c", 70, Question_4_Mail_Prices.calculateStampPrice(false, false));
    }


    @Test(timeout=3000)
    public void testCalculateStampPriceUsesConstants() {

        int originalMachinablePrice = Question_4_Mail_Prices.MACHINABLE_LETTER_PRICE;
        int originalNonMachinableSurcharge = Question_4_Mail_Prices.NON_MACHINABLE_SURCHARGE;

        int machinable = 1000000;
        int surcharge = 4;

        Question_4_Mail_Prices.MACHINABLE_LETTER_PRICE = machinable;
        Question_4_Mail_Prices.NON_MACHINABLE_SURCHARGE = surcharge;

        assertEquals("Rectangular, flat letters should cost 49c", machinable, Question_4_Mail_Prices.calculateStampPrice(true, true));
        assertEquals("Rectangular, not-flat letters should cost 70c", machinable+surcharge, Question_4_Mail_Prices.calculateStampPrice(true, false));
        assertEquals("Non-rectangular, flat letters should cost 70c", machinable+surcharge, Question_4_Mail_Prices.calculateStampPrice(false, true));
        assertEquals("Non-rectangular, not-flat, letters should cost 70c", machinable+surcharge, Question_4_Mail_Prices.calculateStampPrice(false, false));

        Question_4_Mail_Prices.MACHINABLE_LETTER_PRICE = originalMachinablePrice;
        Question_4_Mail_Prices.NON_MACHINABLE_SURCHARGE = originalNonMachinableSurcharge;

    }

}