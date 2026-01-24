package week_1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



public class Question_6_Windows10Upgrade_Test {
    
    @Test(timeout=3000)
    public void testWin10UpgradeCanUpgrade() {


        /*
         To upgrade to Windows 10, a computer needs to have:

         •	Either Windows 7 OR Windows 8 installed
         •	1 GHz or faster processor
         •	2 GB or more RAM

         */


        String w7 = "Windows 7";
        String w8 = "Windows 8";

        /// Successful upgrade configurations

        // Test with all requirements exactly, Windows 7
        assertTrue("Windows 7, 1GHz processor, 2GB of RAM should return true", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w7, 1, 2));
        // Test with all requirements exactly, Windows 8
        assertTrue("Windows 8, 1GHz processor, 2GB of RAM should return true", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w8, 1, 2));

        // Test with all requirements, CPU exceeds, Windows 7
        assertTrue("Windows 7, 2GHz processor, 2GB of RAM should return true", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w7, 2, 2));
        // Test with all requirements, CPU exceeds, Windows 8
        assertTrue("Windows 8, 2GHz processor, 2GB of RAM should return true", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w8, 2, 2));

        // Test with all requirements, RAM exceeds, Windows 7
        assertTrue("Windows 7, 1GHz processor, 4GB of RAM should return true", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w7, 1, 4));
        // Test with all requirements, RAM exceeds, Windows 8
        assertTrue("Windows 8, 1GHz processor, 4GB of RAM should return true", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w8, 1, 4));

        // Test with all requirements, CPU and RAM exceeds, Windows 7
        assertTrue("Windows 7, 2GHz processor, 4GB of RAM should return true", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w7, 2, 4));
        // Test with all requirements, CPU and RAM exceeds, Windows 8
        assertTrue("Windows 8, 2GHz processor, 4GB of RAM should return true", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w8, 2, 4));

    }

    @Test(timeout=3000)
    public void testWin10UpgradeCantUpgrade() {

        // Combinations that are not ok for upgrades

        String w7 = "Windows 7";
        String w8 = "Windows 8";
        String linux = "Linux";

        // Test with different OS, RAM and CPU exact match
        assertFalse("Linux, 1GHz processor, 2GB of RAM should return false", Question_6_Windows_10_Install.checkWindows10SystemRequirements(linux, 1, 2));
        // Test with different OS, RAM and CPU exceed
        assertFalse("Linux, 2GHz processor, 3GB of RAM should return false", Question_6_Windows_10_Install.checkWindows10SystemRequirements(linux, 2, 3));


        // Test with Win 7, CPU OK, not enough RAM
        assertFalse("Windows 7, 1GHz processor, 1GB of RAM should return false", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w7, 1, 1));
        // Test with Win 8, CPU OK, not enough RAM
        assertFalse("Windows 8, 1GHz processor, 1GB of RAM should return false", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w8, 1, 1));


        // Test with Win 7, not enough CPU, not enough RAM
        assertFalse("Windows 7, 0.5GHz processor, 1GB of RAM should return false", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w7, 0.5, 1));
        // Test with Win 8, not enough CPU, not enough RAM
        assertFalse("Windows 8, 0.5GHz processor, 1GB of RAM should return false", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w8, 0.5, 1));


        // Test with Win 7, not enough CPU, RAM ok
        assertFalse("Windows 7, 0.5GHz processor, 4GB of RAM should return false", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w7, 0.5, 4));
        // Test with Win 8, not enough CPU,  RAM ok
        assertFalse("Windows 8, 0.5GHz processor, 4GB of RAM should return false", Question_6_Windows_10_Install.checkWindows10SystemRequirements(w8, 0.5, 4));


        // There's more combos, but this should cover most cases....

    }
}
