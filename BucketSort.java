import javax.swing.*;
import java.util.Arrays;

/**
 * @Auther:何玉萍
 * @Date:2020/12/14 18:59
 * @Description:
 */
public class BucketSort {

    public static int[] sort(int[] array){
        int[] arr = Arrays.copyOf(array,array.length);
        bucketSort(arr,5);
        return arr;
    }

    private static void bucketSort(int[] arr, int size) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        int count = (max-min)/size+1;
        int[][] buckets = new int[count][0];
        for (int i = 0; i < arr.length; i++){
            int pos = (arr[i]-min)/size;
            buckets[pos]=arrAppend(buckets[pos],arr[i]);
        }
        int index = 0;
        for(int[]bucket:buckets){
            if(bucket.length == 0)
                continue;
            InsertSort.sort(bucket);
            for (int value:bucket){
                arr[index++] = value;
            }
        }
    }

    private static int[] arrAppend(int[] array, int value) {
        array = Arrays.copyOf(array,array.length+1);
        array[array.length-1] = value;
        return  array;
    }
}
