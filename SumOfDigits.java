import java.util.Scanner;

public class SumOfDigits{

    static int SumOfD(int n){
        if (n >= 0 && n <= 9){
            return n;
        }
        return SumOfD(n/10) + (n%10);
    }

    public static void main(String[] args) {

        System.out.println(SumOfD(5436));
    }
}
