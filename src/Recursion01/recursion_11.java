package Recursion01;

public class recursion_11 {
    static int Lcm(int x, int y) {
        if (y == 0) return x;
        return (x * y) / Lcm(y, x % y);
    }

    public static void main(String[] args)  {
        System.out.println(Lcm(2, 3));
    }
}
