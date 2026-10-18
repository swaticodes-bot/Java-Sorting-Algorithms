import java.util.Arrays;

public class SortingDemo {
    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    changed = true;
                }
            }
            if (!changed) break;
        }
    }

    public static void main(String[] args) {
        int[] values = {7, 2, 9, 1, 5};
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }
}
