import java.util.Arrays;

/**
 * @Author:何玉萍
 * @Date:2020/12/14 18:59
 * @Description:
 */
public class CountingSort {

    public static int[] sort(int[] array){
        //数组元素需大于等于0
        int[] arr = Arrays.copyOf(array,array.length);
        int maxValue = getMaxValue(arr);
        countingSort(arr,maxValue);
        return arr;
    }

    private static void countingSort(int[] arr,int max) {
        int size = max+1;
        int[] bucket = new int[size];
        for (int value:arr){
            bucket[value]++;
        }
        int index = 0;
        for (int i = 0; i < size; i++) {
            while (bucket[i] > 0){
                arr[index++] = i;
                bucket[i]--;
            }
        }
    }

    private static int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return  max;
    }
}
