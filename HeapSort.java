import java.util.Arrays;


/**
 * @Author:何玉萍
 * @Date:2020/12/14 18:59
 * @Description:堆排序
 */
public class HeapSort {
    public static int[] sort(int[] array){
        int[] arr = Arrays.copyOf(array,array.length);
        int len = arr.length;
        //初始化时构建一个最大堆
        buildMaxHeap(arr,len);
        for (int i = len-1; i > 0 ; i--) {
            swap(arr,0,i); //交换第一个节点和最后一个节点
            len--;
            heapify(arr,0,len);
        }
        return arr;
    }

    private static void heapify(int[] arr, int i, int len) {
        int left = i*2+1;
        int right = i*2+2;
        int largest = i;
        if(left < len && arr[left] > arr[largest])
            largest = left;
        if(right < len && arr[right] > arr[largest])
            largest = right;
        if(arr[largest] != arr[i]){
            swap(arr,i,largest);
            heapify(arr,largest,len);
        }
    }

    private static void swap(int[]arr,int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void buildMaxHeap(int[] arr, int len) {
        for (int i = len/2; i >= 0 ; i--) {
            heapify(arr,i,len);
        }
    }
}
