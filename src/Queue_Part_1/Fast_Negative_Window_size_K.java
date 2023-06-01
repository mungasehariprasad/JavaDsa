package Queue_Part_1;

import java.util.LinkedList;
import java.util.Queue;

public class Fast_Negative_Window_size_K {
    public long[] printFistNegativeInteger(int[] A, int N, int K) {
        long[] res = new long[N - K + 1];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            if (A[i] < 0) {
                q.add((int) i);

            }
        }
        for (int i = 0; i < N - K + 1; i++) {
            if (q.size()>0&&q.peek() < i) q.remove();

             if (q.size()>0&&q.peek() <= i + K - 1) {
                res[i] = A[Math.toIntExact(q.peek())];
            }
            else if (q.size()==0)res[i]=0;
            else res[i] = 0;
        }
        return res;
    }
    public static void main(String[]     args) {
        Fast_Negative_Window_size_K k=new Fast_Negative_Window_size_K();
        int A[] ={12,-1,-7,8,-15,30,16,28};
        int N=8;
        int K=3;
        System.out.println( k.printFistNegativeInteger(A,N,K));
    }
}
