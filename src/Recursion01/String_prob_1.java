package Recursion01;
import java.util.Scanner;
public class String_prob_1 {
    static String remove_2(String s){
        if(s.length()==0)return "";
        String sm=remove_2(s.substring(1));
        char cur=s.charAt(0);
        if (cur!='a')return cur+sm;
        return sm;
    }

    static String remove(String s,int idx){
        if (idx==s.length()) return "";
        String smallAns= remove(s,idx+1);
        char cur=s.charAt(idx);
        if (cur!='a'){
            return cur+smallAns;
        }
            return smallAns;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
//        System.out.println(remove(s,0));

        System.out.println(remove_2(s));

    }
}
