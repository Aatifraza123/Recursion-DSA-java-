import java.util.Scanner;

public class Power2Method {

    static int Pow(int p, int q){
        if (q == 0){
            return 1;
        }
        int SmallPow = Pow(p, q/2);
       if (q % 2 == 0){  // even

            return SmallPow * SmallPow;
        }

        return p * SmallPow * SmallPow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int p = sc.nextInt();
        System.out.println("Enter Second number");
        int q = sc.nextInt();
        System.out.println(Pow(p,q));
    }
}
