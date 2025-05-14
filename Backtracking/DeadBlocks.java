package Backtracking;

public class DeadBlocks {
    public static void mymaze(int sr, int sc, int er, int ec, String str,int [][] maze, boolean[][] isvisited ){
        // base case
        if(sr < 0 || sc<0) return;
        if(sr > er || sc > ec) return;
        if(isvisited[sr][sc] == true) return;
        if(sr == er && sc == ec) {
            System.out.println(str);
            return;
        }

        // mera kaaam
        isvisited[sr][sc] = true;
        if(maze[sr][sc] == 0 ) return;
        // going all directions
        mymaze(sr, sc+1, er, ec, str+"R", maze, isvisited);
        // going down
        mymaze(sr+1, sc, er, ec, str+"D",maze, isvisited);
        // going left
        mymaze(sr, sc-1, er, ec, str+"L",maze, isvisited);
        // going up
        mymaze(sr-1, sc, er, ec, str+"U", maze, isvisited);

        // backtracking
        isvisited[sr][sc] = false;

    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int maze [] [] = {{1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}};
        boolean [][] isvisited = new boolean[rows][cols];
        mymaze(0,0,rows-1, cols-1, "", maze, isvisited);

    }
}
