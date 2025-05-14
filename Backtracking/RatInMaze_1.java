package Backtracking;



public class RatInMaze_1 {

//     rat in maze 2x2
    public static int maze(int sr, int sc, int er, int ec){
        // base case
        if(sr == er || sc == ec) return 1;
        if(sr>er && sc>ec) return 0;

        // mera kaaam
        // ek row down jane ke liye
        int downkey = maze(sr+1, sc, er, ec);
        int rightkey = maze(sr, sc+1, er,ec);
        int result = downkey + rightkey;
        return result;
    }


    // rat in maze but printing the paths (RDR, DRD ) just like that
//    public static void mazepaths(int sr, int sc, int er, int ec, String str){
//        if(sr>er || sc>ec ) return;
//        if(sr == er && sc == ec){
//            System.out.println(str);
//            return;
//        }
//        // mera kaaaam
//        // ek right jane ke liye
//        mazepaths(sr, sc+1, er, ec, str + "R");
//        // ek down jane ke liye
//        mazepaths(sr+1, sc, er, ec, str + "D");
//    }



    public static void main(String[] args) {

         int rows = 3;
        int cols = 3;
        int count = maze(1,1,rows, cols);
        System.out.println("total ways to reaach final destination is : " + count);


        // path finding
//        int rows = 3;
//        int cols = 2;
//        mazepaths(1,1,rows, cols, "");

    }
}
