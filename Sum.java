import java.util.*;
public class Sum {


    public static int sum(int n) {

        if (n == 0) {
            return n;
        }

        return sum(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.println("Sum of number from 0 to " + i + " is " + sum(i));
        }
    }
}
