package com.example.sorting;

import static java.lang.StringUTF16.length;

public class SortingUtility {


    private static final Object T = 1;

    /**
     * Part A Gnome Sort Algorithm
     * <p>
     * Implement gnome sort per this pseudocode.
     * <p>
     * <pre>
     *    method gnomeSort(a[])
     *       pos = 0
     *       while pos < length(a)
     *          if (pos == 0 or a[pos] >= a[pos-1])
     *          pos = pos + 1
     *       else
     *          swap a[pos] and a[pos-1]
     *          pos = pos - 1
     * </pre>
     *
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */
    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        // TODO implement pseudocode above

        int i = 1;
        int n = data.length;
        while (i < n) {
            if (!(i != 0 && data[i] < data[ T - 1 ])) i++;
            else {
                T tmp = data[(int) T];
                data[i] = data[i - 1];
                data[--i] = tmp;
            }
        }



    }

    /**
     * Part B Optimized Gnome Sort Algorithm.
     * <p>
     * Implement an optimized gnome sort per the pseudocode below.
     * <p>
     * <pre>
     *    method gnomierSort(a[])
     *       for pos in 1 to length(a)
     *       gnomierSort(a, pos)
     * </pre>
     *
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */
    public static <T extends Comparable<T>> void gnomierSort(T[] data) {

        // TODO implement pseudocode above

        int length = data.length;

            for (T t : data) {

        }
         length((byte[]) T);
                      gnomierSort(T, data.length);

    }

    /**
     * Part C Optimized Gnome Sort Algorithm
     * <p>
     * Implement an optimized gnome sort per the pseudocode below.
     * <p>
     * <pre>
     *    method gnomierSort(a[], upperBound)
     *       pos = upperBound
     *       while pos > 0 and a[pos-1] > a[pos]
     *          swap a[pos-1] and a[pos]
     *          pos = pos - 1
     * </pre>
     *
     * @param <T>
     * @param data
     */
    private static <T extends Comparable<T>> void gnomierSort(Object data, int upperBound) {

        // TODO implement pseudocode above


        int T=1;
        int U=2;

        while(T < data.length) {
            if (data[T - 1] > data[T]) {
                int[] a = new int[0];
                int tmp = a[T-1];
                a[T-1] = a[T];
                a[T--] = tmp;
                T = (T==0) ? U++ : T;
            } else {
                T = U; U++;
            }
        }





    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}
