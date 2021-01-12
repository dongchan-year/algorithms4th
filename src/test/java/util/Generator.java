package util;

import java.util.Random;

/**
 * @author Dongchan Year
 */
public class Generator {

    public static char[] generateString(int length) {
        char[] alphabet = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        Random random = new Random();
        char[] s = new char[length];
        for (int i = 0; i < length; i++) {
            int r = random.nextInt(27);
            s[i] = alphabet[r];
        }
        return s;
    }
}
