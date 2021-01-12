package util;

/**
 * @author Dongchan Year
 */
public enum SortingHelper {

    DUAL_PIVOT_QUICKSORT("Dual-Pivot Quicksort") {
        @Override
        public void sort(Object a) {

        }

        @Override
        public void sort(Object a, int low, int high) {
            Quick.sort((Comparable[]) a, low, high);
        }
    },

    ARRAYS_SORT("Arrays.sort") {
        @Override
        public void sort(Object a) {

        }

        @Override
        public void sort(Object a, int low, int high) {
            if (a instanceof int[]){
                Arrays.sort((int[]) a, low, high);
            }
        }
    };

    private SortingHelper(String name) {
       this.name = name;
    }

    private String name;

    abstract public void sort(Object a);

    abstract public void sort(Object a, int low, int high);
}
