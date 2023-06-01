package Backtracking;
public class FourDirctionMazePath {
    public static void main(String[] args) {
        int rows=4;
        int cols=6;
        boolean[][] isvisited=new boolean[rows][cols];
        maze(0,0,rows-1,cols-1,"",isvisited);
    }
    private static void maze(int sr, int sc, int er, int ec,String s,boolean[][] isvisited) {
        if (sr<0||sc<0)return;
        if (sr>er||sc>ec)return;
        if (isvisited[sr][sc]==true) return;//v IMP
        if (sr==er&&sc==ec){
            System.out.println(s);
            return;
        }
        isvisited[sr][sc]=true;
        maze(sr,sc+1,er,ec,s+"R",isvisited);//right
        maze(sr+1,sc,er,ec,s+"D",isvisited);//down
        maze(sr,sc-1,er,ec,s+"L",isvisited);//left
        maze(sr-1,sc,er,ec,s+"U",isvisited);//Up
        isvisited[sr][sc]=false;//BackTracking

    }
}
