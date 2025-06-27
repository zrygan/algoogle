package search.binary_search;

public class BinarySearch {
    public static boolean binary_search(int[] seq, int key) {
        int low = 0;
        int high = seq.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (seq[mid] < key) {
                low = mid + 1;
            } else if (seq[mid] > key) {
                high = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
