package Recursion01;
public class Qu_Selection_sort {
    static void sortfruits(String[] fruits){
        int n=fruits.length;
        for (int i=0;i<n-1;i++){
            int min_indx=i;
            for (int j=i+1;j<n;j++){
                if (fruits[j].compareTo(fruits[min_indx])<0){
                    min_indx=j;

                }
            }
            String temp=fruits[i];
            fruits[i]=fruits[min_indx];
            fruits[min_indx]=temp;
        }

    }
    public static void main(String[] args) {
        String[] fruits={"kiwi","apple","papaya","mango"};
        sortfruits(fruits);
        for (String val:fruits
             ) {
            System.out.print(val+" ");

        }
    }
}
