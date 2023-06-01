package Backtracking;

public class RatMazeOptimised {
    public static void main(String[] args) {
        int rows=3;
        int cols=4;
        int[][] maze={{1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}};

        maze(0,0,rows-1,cols-1,"",maze);
    }
    private static void maze(int sr, int sc, int er, int ec, String s,int[][] maze) {
        if (sr<0||sc<0)return;
        if (sr>er||sc>ec)return;
        if (sr==er&&sc==ec){
            System.out.println(s);
            return;
        }

        if (maze[sr][sc]==0)return;
        if (maze[sr][sc]==-1)return;
        maze[sr][sc]=-1;
        maze(sr,sc+1,er,ec,s+"R",maze);//right
        maze(sr+1,sc,er,ec,s+"D",maze);//down
        maze(sr,sc-1,er,ec,s+"L",maze);//left
        maze(sr-1,sc,er,ec,s+"U",maze);//Up
        maze[sr][sc]=1;
    }
}
