public class LinearSearch {

    static boolean Search(int[] arr, int n, int target, int idx) {
        if (idx >= n) {
            return false;
        }
        if (arr[idx] == target) {
            return true;
        }
        return (Search(arr, n, target, idx+1));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6,};
        int target = 14;
        if (Search(arr, arr.length, target, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
