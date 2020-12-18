import java.util.Arrays;

/**
 * @Author:何玉萍
 * @Date:2020/12/14 19:15
 * @Description:插入排序：将待插入元素插入前面有序序列中
 */
public class InsertSort {
    public static int[] sort(int[] array){
        int[] arr = Arrays.copyOf(array,array.length);
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i;
            while (j>0&&tmp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
           arr[j] = tmp;
        }
        return arr;
    }
}
