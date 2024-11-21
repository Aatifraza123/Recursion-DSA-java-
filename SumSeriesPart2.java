import java.util.Scanner;

public class SumSeriesPart2 {

    static int SumSeries(int n){
        if (n == 0){
            return n;
        }
        if (n % 2 == 0){
            return SumSeries(n-1) - n;
        }else{
            return SumSeries(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(SumSeries(n));
    }
}
