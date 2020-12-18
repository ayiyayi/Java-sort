import java.util.Arrays;

/**
 * @Author:何玉萍
 * @Date:2020/12/14 18:59
 * @Description:冒泡排序
 */
public class BubbleSort {

    public static int[] sort(int[] array){
        int[] arr = Arrays.copyOf(array,array.length);
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            flag = false;
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }
//            如果某次遍历没有交换元素，则排序完成，提前退出
            if(!flag) break;
        }
        return arr;
    }
}
