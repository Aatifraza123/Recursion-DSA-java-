import java.util.*;
public class SumSeries {

    static int SeriesSum1(int n){
        if (n == 0) {
            return n;
        }
        return SeriesSum1(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(SeriesSum1(n));
    }
}
