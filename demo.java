import java.util.*;

public class demo {
    static void PrintDecreaing(int n) {
        if (n == 1) {
           System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintDecreaing(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        PrintDecreaing(n);
    }
}
