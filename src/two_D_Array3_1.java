import java.util.Scanner;

public class two_D_Array3_1{
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix,int r,int c){
        int toprow=0,bootmrow=r-1, leftcol=0,rightcol=c-1;
        int totalel=0;
       while (totalel<r*r){
        for (int j=leftcol;j<=rightcol && totalel<r*r;j++){
            System.out.print(matrix[toprow][j]+" ");

            totalel++;
        }
        toprow++;
        for (int i=toprow;i<=bootmrow && totalel<r*r;i++){
            System.out.print(matrix[i][rightcol]+" ");
            totalel++;
        }
        rightcol--;
        for (int j=rightcol;j<=leftcol && totalel<r*r;j++){
            System.out.print(matrix[bootmrow][j]+" ");
            totalel++;
        }
        bootmrow--;
        for (int i=bootmrow;i>=toprow && totalel<r*r;i--){
            System.out.print(matrix[i][leftcol]+" ");
            totalel++;
        }
        leftcol++;

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
        printMatrix(matrix);

        printSpiralOrder(matrix,r,c);


    }

}
