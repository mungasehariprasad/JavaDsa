import java.util.Scanner;

public class two_D_Array2_1 {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

//    static int[][] findTran(int[][] matrix,int r,int c){
//        int[][] ans=new int[r][c];
//        for (int i=0;i<c;i++){
//            for (int j=0;j<r;j++){
//                ans[i][j]=matrix[j][i];
//            }
//
//        }
//        return ans;
//    }
    static void transpo(int[][] matrix,int r,int c){
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
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
//        System.out.println("Enter the of row and cloumns of matrix 2");
//        int r2=sc.nextInt();
//        int c2=sc.nextInt();
//        int[][] b=new int[r2][c2];
//        System.out.println("Enter the matrix Values");
//        for (int i=0;i<r;i++){
//            for (int j=0;j<c;j++){
//                matrix[i][j]=sc.nextInt();
//            }
//        }
        printMatrix(matrix);
        System.out.println("Input Matrix");
        System.out.println("Tramspose of matrix");
        transpo(matrix,r,c);
        printMatrix(matrix);
//
//        int[][] ans=findTran(matrix,r,c);
//        printMatrix(ans);


    }
}
