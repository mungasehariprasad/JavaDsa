package pw_Stack_part1;

import java.util.Scanner;
import java.util.Stack;

public class validParenthrses {
    public static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for (int i=0;i<n;i++){
            char ch=str.charAt(i);
            if (ch=='('||ch=='['||ch=='{')
                st.push(ch);
           else if (st.size()>0){
               char dh=st.peek();
               if (ch==')'){
                   if (dh=='(')st.pop();
                   else return false;
               }
               if (ch==']'){
                   if (dh=='[')st.pop();
                   else return false;
               }
               if (dh=='}'){
                   if(dh=='{')st.pop();
                   else return false;
               }

            }
           else return false;

        }
        if (st.size()>0)return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
