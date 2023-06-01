import java.util.Scanner;

public class Array3_2 {
    static int tripletsum(int[] arr,int target){
        int ans=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+"Elements");
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter target sum=");
        int target=sc.nextInt();
        System.out.println(tripletsum( arr,target));
    }
}
