import java.util.*;
public class String_Occurrences {

    static String removeA(String s, int idx){
        if (idx == s.length()) {
            return "";
        }
            String Smallans = removeA(s,idx + 1);

            char Currchar = s.charAt(idx);

            if (Currchar != 'a'){
                return Currchar + Smallans;
            }
            else{
                return Smallans;
           }

        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.nextLine();
        System.out.println(removeA(s,0));

    }
}
