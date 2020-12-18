import java.util.Arrays;

/**
 * @Author:何玉萍
 * @Date:2020/12/14 18:59
 * @Description:快速排序
 */
public class QuickSort {

    public static int[] sort(int[] array){
        int[] arr = Arrays.copyOf(array,array.length);
        quickSort(arr,0,arr.length-1);
        return  arr;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int left = low;
        int right = high;
        int pivot = arr[low];
        while (left < right){
            while (arr[right] >= pivot && left<right){
                right--;
            }
            while (arr[left] <= pivot && left<right ){
                left++;
            }
            if(left < right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        arr[low] = arr[left];
        arr[left] = pivot;
        quickSort(arr,low,right-1);
        quickSort(arr,right+1,high);
    }
}
