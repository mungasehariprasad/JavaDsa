package patterns_recursion;

import java.util.Scanner;

public class L1 {
     static void patterns(int r,int c){
         if (r==0) return;
         if (c<r){
             System.out.print("*");
             patterns(r,c+1);
         }
         else {
             System.out.println();
             patterns(r -1, 0);
         }
     }
     static void patterns_2(int r,int c){
         if (r==0) return;
         if (r>c){
             patterns_2(r,c+1);
             System.out.print("*");
         }
         else {
             patterns_2(r-1,0);
             System.out.println();
         }
     }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int r=sc.nextInt();
//        int c=sc.nextInt();
        patterns_2(4,0);
    }
}
