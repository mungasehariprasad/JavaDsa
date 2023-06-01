package Recursion01;
import java.util.ArrayList;
public class ArrayList_pro_1 {
    static ArrayList<Integer> search_Index(int[] arr, int x, int idx) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx >= arr.length) return ans;//return empty arraylist
        if (arr[idx] == x) {
            ans.add(idx);
        }
        ArrayList<Integer> small_ans=search_Index(arr, x, idx + 1);
        ans.addAll(small_ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 4};
        ArrayList<Integer> ans = search_Index(arr, 4, 0);
        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}