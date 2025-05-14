package Arrays;

public class Arrays_2 {
    public static void main(String[] args) {


// searching an element from the array
//        int numw[] = {10, 22, 3, 41, 5};   // declaring the array
//        int searchNum = 41;                 // which element want to search
//        int count = 0;
//        int i;
//        for ( i = 0; i < numw.length; i++) {      // traverse the array
//            if (numw[i] == searchNum) {            // found the element so count will be ++ means ke 1 ho jayega.
//                count++;
//                break;                           // and will be break after getting same element of finding
//            }
//        }
//        if(count > 0) {                         // then count becomes the 1 after getting same element and checs the grater than 0, YES
//            System.out.println("item found at index " + i);            // prints the item found at index.
//        }
//        else{
//            System.out.println("item not found");               // if count is not greater than 0 so print the index not found.
//        }







//  update the element from the array
//        int c [] = {10,14,9,14};
//        c[2] = 45;         // defining the element which I want to update at index 2
//        System.out.println("Updated Array: ");
//        for( int i=0; i< c.length; i++){
//            System.out.print(c[i] + " ");
//        }







        // 2D ARRAYS
        // int b [] [] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};    // taking a rows = 3 and columns = 4

        // i am running for loop i=0 se lekar 3 tak kyu ki rows 3 hai jaise 0 rows pe 0 wale column ka element
//        for(int i=0; i<3; i++){
            /* waise hi aage bhi 0 rows pe 1 wala element and 2 wala element and 3 wala bhi -  phir loop end ho jayega phir se upar wale loop me jayega i++
               hoyenga means ke 0 se 1 ban jayega - again loop chalega i<3 yes then come in below loop aur phir 1 row pe 0 element 1 row pe 1 element and so on
            */
//            for (int j=0; j<4; j++){
//                System.out.print( b[i][j] + " ");
//            }
//            System.out.println();
//        }




// taking input from user and printing array elements of 2 -D array
//        int rows, cols;
//        Scanner s = new Scanner(System.in);
//        System.out.println("enter the number of rows");
//        rows = s.nextInt();
//        System.out.println("enter the number of columns");
//        cols = s.nextInt();
//        int a [] [] = new int[rows][cols];
//
//        System.out.println("enter the numbers of elements: ");;
//        for(int i=0; i<rows; i++){
//            for(int j=0; j< cols; j++){
//                a[i][j] = s.nextInt();
//            }
//        }
//        for (int i=0; i< rows; i++){
//            for (int j = 0; j<cols; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }




    }
}
