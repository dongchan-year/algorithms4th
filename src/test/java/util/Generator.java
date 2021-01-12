package util;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @author Dongchan Year
 */
public class Generator {

    public static String[] generateSingleString(int length){
        return Stream.of(generateChar(length)).map(String::valueOf).toArray(String[]::new);
    }

    public static Character[] generateChar(int length) {
        char[] alphabet = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        Random random = new Random();
        Character[] s = new Character[length];
        for (int i = 0; i < length; i++) {
            int r = random.nextInt(26);
            s[i] = alphabet[r];
        }
        return s;
    }
}
