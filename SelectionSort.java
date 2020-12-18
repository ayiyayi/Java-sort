import java.util.Arrays;

/**
 * @Auther:何玉萍
 * @Date:2020/12/14 19:12
 * @Description:选择排序（打牌）
 */
public class SelectionSort {
    public static int[] sort(int[] array){
        int[] arr = Arrays.copyOf(array,array.length);
        for (int i = 0; i < arr.length; i++) {
          int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(i != min){
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        return arr;
    }
}
