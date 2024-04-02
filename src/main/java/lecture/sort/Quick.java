package lecture.sort;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }

        int pivot = quickSort(array, left, right);
        sort(array, left, pivot - 1);
        sort(array, pivot + 1, right);
    }

    public static int quickSort(int[] array, int left, int right) {
        int low = right;
        int high = left;
        int pivot = array[left];

        while (high < low) {
            while (pivot < array[low] && high < low) {
                low --;
            }

            while (pivot > array[high] && high < low) {
                high ++;
            }

            swap(array, low, high);
        }

        return low;
    }

    public static void swap(int[] array, int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }
}
