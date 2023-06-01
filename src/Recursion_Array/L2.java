package Recursion_Array;
import java.util.ArrayList;
public class L2 {
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findInd(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findInd(arr, target, index + 1);
    }

    static int findIndLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findallIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findallIndex(arr, target, index + 1);
    }

    public static void main(String[] args) {
    int[] arr={1,4,4,6,4};

        System.out.println(findIndLast(arr,6,arr.length-1));
        findallIndex(arr,4,0);
        System.out.println(list);
    }
}
