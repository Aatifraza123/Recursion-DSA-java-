import java.util.Scanner;

public class Main{

    static void PrintNumber(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        PrintNumber(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        PrintNumber(n);
    }
}