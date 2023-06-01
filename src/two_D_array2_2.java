import java.util.Scanner;

public class two_D_array2_2 {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transpo(int[][] matrix,int r,int c){
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void revers(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][] matrix,int n){
        transpo(matrix,n,n);
        for (int i=0;i<n;i++){
            revers(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num row");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];

        System.out.println("Ente the "+ r*c +" elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);
        rotate(matrix,r);
        System.out.println("Rotation of matrix");
        printMatrix(matrix);


    }
}
