import java.util.Arrays;
 
class Main
{
    public static void countsort(int[] arr, int k)
    {
        int[] freq = new int[k + 1];
        for (int i: arr) {
            freq[i]++;
        }
 
        int index = 0;
        for (int i = 0; i < k + 1; i++)
        {
            while (freq[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 4, 2, 10, 10, 1, 4, 2, 1, 10 };
 
        int k = 10;
 
        countsort(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
