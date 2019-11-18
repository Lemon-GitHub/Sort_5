package Sort_5;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        //升序
        //[0,bound)已排序区间
        //[bound, size)待排序
        for(int bound = 0; bound < array.length; bound++){
            for(int cur = array.length - 1; cur > bound; cur--){
                if(array[cur - 1] > array[cur]){
                    swap(array, cur - 1, cur);
                }
            }
        }
    }

    public static void swap(int[] array, int x, int y) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7, 3, 6, 8, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
