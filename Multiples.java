import java.util.Scanner;

public class Multiples {

    static void MultipleNumber(int n, int k) {
        if (k == 0) {
            return ;
        }

        MultipleNumber(n,k-1);
        System.out.println(n * k);
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
     int n = sc.nextInt();
        System.out.println("Enter value of k");
     int k = sc.nextInt();
        MultipleNumber(n,k);
    }
}