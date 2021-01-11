package chapter2;

import util.SortingHelper;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;

/**
 * @author Dongchan Year
 */
public class Sorting {

    private static final PrintStream out = System.out;
    private static final InputStream in = System.in;

    // Array lengths used in a short run
    private static final int[] SHORT_RUN_LENGTHS = {
            1, 8, 55, 100, 10_000
    };

    // Random initial values used in a short run
    private static final TestRandom[] SHORT_RUN_RANDOMS = {
            TestRandom.C0FFEE};

    private final SortingHelper sortingHelper;
    private final int[] lengths;
    private final TestRandom[] randoms;
    private Object[] test;

    private Sorting(SortingHelper sortingHelper, TestRandom[] randoms, int[] lengths) {
        this.sortingHelper = sortingHelper;
        this.lengths = lengths;
        this.randoms = randoms;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int[] lengths = SHORT_RUN_LENGTHS;
        TestRandom[] randoms = SHORT_RUN_RANDOMS;

        new Sorting(SortingHelper.DUAL_PIVOT_QUICKSORT, randoms, lengths).testCore();

        long end = System.currentTimeMillis();
        out.format("PASSED in %d sec.\n", (end - start) / 1000);
    }

    private void testCore() {
        for (int length : lengths) {
            createData(length);
            testCore(length);
        }
    }

    private void testCore(int length) {
        for (TestRandom random : randoms) {
            testMergingSort(length, random);
        }
    }

    private void testMergingSort(int length, TestRandom random) {

        for (MergingBuilder builder : MergingBuilder.values()) {
            builder.build();

            for (int i = 0; i < test.length; i++) {
                printTestName("Test merging sort", random, length,
                        ", m = ");
//            sortingHelper.sort(test[i]);
                checkSorted(test[i]);
            }
        }

        out.println();
    }

    private void checkSorted(Object a){
        if (a instanceof int[]){
          checkSorted((int[])a);
        }
    }

    private void checkSorted(int[] a){
        for (int i = 0; i < a.length - 1; i++){
            if (a[i] > a[i+1]) {
                fail("Array is not sorted at " + i + "-th position: "+ a[i] + " and " + a[i+1]);
            }
        }
    }

    private void fail(String message){

    }

    private static enum MergingBuilder {

        abstract void build();
    }

    private void createData(int length) {
        test = new Object[]{
                new int[length], new long[length],
                new byte[length], new char[length], new short[length],
                new float[length], new double[length]
        };
    }

    private void printTestName(String test, TestRandom random, int length, String message) {
        out.println(test + "' length = " + length + ", random = " + random + message);
    }

    private static class TestRandom extends Random {
        private static final TestRandom C0FFEE = new TestRandom(0xC0FFEE);

        private TestRandom(long seed) {
            super(seed);
        }
    }
}
