package Recursion01;
public class SelectionSort {
    static void Selection(int[] a){
        int n=a.length;
        for (int i=0;i<n-1;i++){
            int min_idx=i;
            for (int j=i+1;j<n;j++){
                if (a[j]< a[min_idx]){
                    min_idx=j;
                }
            }
            if (min_idx!=i){
                int temp=a[i];
                a[i]=a[min_idx];
                a[min_idx]=temp;
            }
        }

    }
    public static void main(String[] args) {
        int[] a={3,2,1,4,5};
        Selection(a);
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]+" ");
        }
    }
}
