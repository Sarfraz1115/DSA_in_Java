package Backtracking;

public class RatInMaze4Direction {


    // rat in maze using backtracking in four directions
    public static void maze(int sr, int sc, int er, int ec, String str, boolean[][] isvisited ){
        // base case
        if(sr<0 || sc<0)
            return;
        if(sr>er || sc>ec)
            return;
        // checking there is a true if yes so return no so you can go
        if(isvisited[sr][sc] == true)
            return;
        if(sr == er && sc == ec){
            System.out.println(str);
            return;
        }

        // mera kaaam
        // first I am doing true to that place because I visited
        isvisited[sr][sc] = true;
        // now going all directions
        // going right
        maze(sr, sc+1, er, ec, str+"R", isvisited);
        // going down
        maze(sr+1, sc, er, ec, str+"D", isvisited);
        // going left
        maze(sr, sc-1, er, ec, str+"L", isvisited);
        // going up
        maze(sr-1, sc, er, ec, str+"U", isvisited);

        // most important backtracking
        // while backtracking we have to do place false because we have to go through that places for another path
        isvisited[sr][sc] = false;  // now this is false so that we can go to that place for another path

    }



    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
        boolean [][] isvisited = new boolean[rows][cols];
        maze(0,0,rows-1, cols-1, "", isvisited);

    }
}
