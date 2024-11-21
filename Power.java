public class Power {

    static int Pow(int p, int q){
        if (q == 0){
            return 1;
        }
        return Pow(p, q - 1) * p;
    }

    public static void main(String[] args) {
//
        System.out.println(Pow(5,4));
    }
}
