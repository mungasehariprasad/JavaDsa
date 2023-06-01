package Recursion02;
import static Recursion02.L13.helper;
public class L16 {
    static int numberofsteps(int num){
        return helper(num,0);
    }
    private static int helper(int num, int steps){
        if (num==0){
            return steps;
        }
        if (num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
    public static void main(String[] args) {

        System.out.println(numberofsteps(21));
    }
}
