import java.util.Arrays;

/**
 * @Author:何玉萍
 * @Date:2020/12/14 18:59
 * @Description:归并排序：将有序的两个子序列归并
 */
public class MergeSort {

    public static int[] sort(int[] array){
        int[] arr = Arrays.copyOf(array,array.length);
        if(arr.length <= 1) return arr;
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(array,0,mid);
        int[] right = Arrays.copyOfRange(array,mid,arr.length);
        return merge(sort(left),sort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length+right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0){
            if(left[0] < right[0]){
                arr[i++] = left[0];
                left = Arrays.copyOfRange(left,1,left.length);
            }
            else{
                arr[i++] = right[0];
                right = Arrays.copyOfRange(right,1,right.length);
            }
        }
        while (left.length > 0){
            arr[i++] = left[0];
            left = Arrays.copyOfRange(left,1,left.length);
        }
        while (right.length>0){
            arr[i++] = right[0];
            right = Arrays.copyOfRange(right,1,right.length);
        }
        return  arr;
    }
}
