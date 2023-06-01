package Recursion01;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_linear_search {

//   3) This is a search index a print a array and this a index of cerant index print
    static void search_index(int[] arr,int x,int idx){
        if (idx>=arr.length) return;
        if (arr[idx]==x) {
            System.out.println(idx);
        }
         search_index(arr,x,idx+1);
    }
    // 2) this is Linear search is idx output
    static int Search(int[] arr,int target,int idx){
        if (idx==arr.length) return -1;
        if (arr[idx]==target) return idx;
        return Search(arr,target,idx+1);
    }
//  1)  this is a linear search is output ture,false return
    static boolean Linear(int[] arr,int target,int idx){
        if (idx==arr.length) return false;
        if (arr[idx]==target) return true;
        return Linear(arr,target,idx+1);
    }
    public static void main(String[] args) {
        int[] arr={4,4,4,4,4,4};
        search_index(arr,4,0);


    }
}
