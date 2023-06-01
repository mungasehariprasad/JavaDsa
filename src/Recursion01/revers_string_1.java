package Recursion01;
import java.util.Scanner;
import java.util.SplittableRandom;
public class revers_string_1 {

//    2) Not a index in revers string

    static String revese_2(String s){
        if (s.length()==0)return "";
        return revese_2(s.substring(1))+s.charAt(0);
    }

//   1) pass the index in the revers string
    static String revers(String sr,int idx){
        if (idx==sr.length())return "";
        return revers(sr,idx+1)+sr.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sr=sc.nextLine();
        System.out.println(revese_2(sr));
    }
}
