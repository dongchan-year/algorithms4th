package util;

/**
 * @author Dongchan Year
 */
public enum SortingHelper {

    DUAL_PIVOT_QUICKSORT("Dual-Pivot Quicksort") {

    };

    private SortingHelper(String name) {
       this.name = name;
    }

    private String name;
}
