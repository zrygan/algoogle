package search.linear_search;

public class LinearSearch {
    public static boolean linear_search(int[] seq, int key) {
        for (int item : seq) {
            if (item == key) {
                return true;
            }
        }

        return false;
    }
}