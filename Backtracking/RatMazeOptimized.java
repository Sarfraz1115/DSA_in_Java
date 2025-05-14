package Backtracking;

public class RatMazeOptimized {
    public static void mymaze2(int sr, int sc, int er, int ec, String str,int [][] maze ){
        // base case
        if(sr < 0 || sc < 0) return;
        if(sr > er || sc > ec) return;
        if(sr == er && sc == ec){
            System.out.println(str);
            return;
        }
        // mera kaam
        if(maze[sr][sc] == 0) return;
        // I have already visited that place so return from that place
        if(maze[sr][sc] == -1) return;

        // now if I am on that place so do mark it as visited
        maze[sr][sc] = -1;

        // going all directions
        mymaze2(sr, sc+1, er, ec, str+"R", maze);
        // going down
        mymaze2(sr+1, sc, er, ec, str+"D",maze);
        // going left
        mymaze2(sr, sc-1, er, ec, str+"L",maze);
        // going up
        mymaze2(sr-1, sc, er, ec, str+"U", maze);


        // backtracking
        maze[sr][sc] = 1;
    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int maze [] [] = {{1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}};
        mymaze2(0,0,rows-1, cols-1, "", maze);


    }
}
