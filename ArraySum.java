public class ArraySum {

    static int SumOfArray(int[] arr, int idx){
        if (idx == arr.length){
            return 0;
        }
        int SmallAns = SumOfArray(arr, idx + 1);
        return SmallAns + arr[idx];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(SumOfArray(arr,0));
    }
}
