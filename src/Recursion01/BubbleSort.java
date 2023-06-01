package Recursion01;
public class BubbleSort {
    static void bubblesort_1(int[] a){
        int n=a.length;
        for (int i=0;i<n-1;i++){
            boolean flag=false;
            for (int j=0;j<n-i-1;j++){
                if (a[j]>a[j+1]){   //this is min Bubble sort a[j]>a[j+1]   and this is a maxi Bubble sort in a[j]<a[j+1]
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] a={8,3,2,10,1,1};
        bubblesort_1(a);
        for (int i:a) {
            System.out.println(i);
        }
    }
}
