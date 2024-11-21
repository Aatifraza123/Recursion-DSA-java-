public class COD {

    static int CountOfDigits(int n){
        if (n == 0){
            return n;
        }
        return 1 + CountOfDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.println(CountOfDigits(64564));
    }
}
