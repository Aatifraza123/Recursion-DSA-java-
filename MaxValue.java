public class MaxValue {

    static int MaxInArray(int[] arr, int idx){
        if (idx == arr.length - 1){
            return arr[idx];
        }
        int SmallAns = MaxInArray(arr,idx + 1);
        return Math.max(arr[idx],SmallAns);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 76, 89, 45};
        System.out.println(MaxInArray(arr,0));
    }
}
