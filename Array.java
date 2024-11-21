public class Array {

    static void PrintArray(int[] arr, int idx){
        if (idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        PrintArray(arr,idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8};
        PrintArray(arr,0);
    }
}
