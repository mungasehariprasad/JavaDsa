package Backtracking;

public class RatInDeadMazeFourDirection {
    public static void main(String[] args) {
        int rows=3;
        int cols=4;
        int[][] maze={{1,0,1,1},
                      {1,1,1,1},
                      {1,1,0,1}};
        boolean[][] isvisited=new boolean[rows][cols];
        maze(0,0,rows-1,cols-1,"",maze,isvisited);
    }
    private static void maze(int sr, int sc, int er, int ec, String s,int[][] maze,boolean[][] isvisited) {
        if (sr<0||sc<0)return;
        if (sr>er||sc>ec)return;
        if (sr==er&&sc==ec){
            System.out.println(s);
            return;
        }

        if (maze[sr][sc]==0)return;
        if (isvisited[sr][sc]==true)return;
        isvisited[sr][sc]=true;
        maze(sr,sc+1,er,ec,s+"R",maze,isvisited);//right
        maze(sr+1,sc,er,ec,s+"D",maze,isvisited);//down
        maze(sr,sc-1,er,ec,s+"L",maze,isvisited);//left
        maze(sr-1,sc,er,ec,s+"U",maze,isvisited);//Up
        isvisited[sr][sc]=false;
    }
}
