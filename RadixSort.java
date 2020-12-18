import java.util.Arrays;

/**
 * @Auther:何玉萍
 * @Date:2020/12/14 18:59
 * @Description:
 */
public class RadixSort {

    public static int[] sort(int[] array){
        int[] arr = Arrays.copyOf(array,array.length);
        int maxDigit = getMaxDigit(arr);
        radixSort(arr,maxDigit);
        return arr;
    }

    private static void radixSort(int[] arr, int maxDigit) {
        int mod = 10;
        int dev = 1;
        for (int i = 0; i < maxDigit; i++,dev *= 10,mod *= 10) {
            int[][] counter = new int[mod*2][0];
            for (int j = 0; j < arr.length; j++) {
                int bucket = (arr[j]%mod)/dev+mod;
                counter[bucket] = arrAppend(counter[bucket],arr[j]);
            }
            int index = 0;
            for(int[]bucket:counter){
                for (int value:bucket){
                    arr[index++] = value;
                }
            }

        }

    }

    private static int getMaxDigit(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        if(max == 0) return 1;
        int length = 0;
        for(int tmp = max;tmp>0;tmp /= 10){
            length++;
        }
        return length;
    }
    private static int[] arrAppend(int[] array, int value) {
        array = Arrays.copyOf(array,array.length+1);
        array[array.length-1] = value;
        return  array;
    }
}
