package Backtracking;

public class Print_Path_Maze {

    public static void main(String[] args) {
        int rows=6;
        int cols=6;
        maze(1,1,rows,cols,"");

    }
    private static void maze(int sr, int sc, int er, int ec,String s) {
        if (sr>er||sc>ec)return;
        if (sr==er&&sc==ec){
            System.out.println(s);
            return;
        }

        maze(sr,sc+1,er,ec,s+"R");
        maze(sr+1,sc,er,ec,s+"D");


    }
}
