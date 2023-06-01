package Recursion01;
public class printsubsequnces {
    static void print_sub(String s,String currans){
        if (s.length()==0){
            System.out.println(currans);
            return;
        }
        char curr=s.charAt(0);
        String remString=s.substring(1);
        print_sub(remString,currans+curr);
        print_sub(remString,currans);

    }
    public static void main(String[] args) {
        print_sub("abc"," ");
    }
}
