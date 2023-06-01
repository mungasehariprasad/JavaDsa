package Recursion01;

public class KeypadCombination {
    static void combination(String s,String[] kp, String res){
        if(s.length()==0){
            System.out.println(res +" ");
            return;
        }
        int currnum=s.charAt(0)-'0';
        String currchices=kp[currnum];
        for (int i=0;i<currchices.length();i++){
            combination(s.substring(1),kp,res+currchices.charAt(i));
        }

    }
    public static void main(String[] args) {
        String s="2";
        String[] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//                   0   1   2     3     4    5    6      7     8       9
        combination(s,kp,"");
    }
}
