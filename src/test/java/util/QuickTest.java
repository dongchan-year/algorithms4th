package util;


import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Dongchan Year
 */
public class QuickTest {
    private final static Logger LOG = Logger.getLogger(QuickTest.class);

    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, a.length - 1);
    }

    private static boolean isSorted(Comparable[] a, int hi) {
        for (int i = 1; i <= hi; i++) {
            if (Quick.less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    @Test
    public void testQuick() {
        int len = 73;
        Character[] array = Generator.generateChar(len);

        Quick.sort(array, 0, array.length - 1);
        assertTrue(isSorted(array));
    }

}
