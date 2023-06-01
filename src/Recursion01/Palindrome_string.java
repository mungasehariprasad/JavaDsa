package Recursion01;
import javax.swing.*;
import java.util.Scanner;
public class Palindrome_string {
    static boolean palindrome(String s,int l,int r){
        if (l>=r) return true;
        return (s.charAt(r)==s.charAt(l)&& palindrome(s,l+1,r-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(palindrome(s,0,s.length()-1));

    }
}
