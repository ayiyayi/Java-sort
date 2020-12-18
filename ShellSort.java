import java.util.Arrays;

/**
 * @Auther:何玉萍
 * @Date:2020/12/14 19:20
 * @Description:希尔排序
 */
public class ShellSort {
    public static int[] sort(int[] array){
        int[] arr = Arrays.copyOf(array,array.length);
        int gap = arr.length/2;
        while (gap > 0){
            for (int i = gap; i < arr.length; i++) {
                int tmp = arr[i];
                int j = i-gap;
                while (j>=0&&arr[j]>tmp){
                    arr[j+gap] = arr[j];
                    j -= gap;
                }
                arr[j+gap] = tmp;
            }
            gap /= 2;
        }

        return arr;
    }
}
