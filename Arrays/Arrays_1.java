package Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        // 1-D Array
//        int [] marks = new int[3];
//        marks[0] = 34;
//        marks[1] = 35;
//        marks[2] = 37;
//        System.out.println(marks[0]);

        // 2-D Arrays
//        int [] [] mymarks = {{40,50,55},{60,63,64},{71,72,73}};
//        System.out.println(mymarks[1][2]);





// array declaring but not initializing
//        int [] marks = new int[3];
//        System.out.println(marks[1]);   // it will print 0 because I have not initialized marks[1].





        // Traversing an Arrays
/* by traversing an array,  hum array ke saare elements se hokar guzar te hai
ek ke baad ek aur hum un sabhi elements ko prints kara sakte hai ya phir kuch aur bhi. */

        // 1) For - Each Loop
//        int [] ages = {40,43,44};
//        for (int myage : ages){
//            System.out.println(myage);
//        }

        // 2) for loop
//        int [] ages = {23,34,22,14};
//             for (int i=0; i<ages.length;i++){
//            System.out.println(ages[i]);
//        }





        // taking Array input
//        Scanner ss = new Scanner(System.in);
//        System.out.println("enter the array size");
//        int n = ss.nextInt();
//        System.out.println("enter the " + n + " elements");
//        int [] arr = new int[n];
//        for (int i=0; i<arr.length; i++){
//            arr[i] = ss.nextInt();
//        }
//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }




// Inserting an element in the array

// sab se pehle mai mera array banaoga
//    int [] num1 = {12,13,14,15,16};
//// mai ek aur array ko banaoga jo hoga 1 index extra kyuki mujhe ek new element insert karana hai
//    int [] num2 = new int[num1.length + 1];
//// ab mai new element aur konse position ya phir index pe insert karana hai wo likhoga
//    int element = 98;
//    int index = 2;                     // index = 2(i=2) hai tu matlab hum aisa bhi kar sakte hai position = 3 (i = position - 1) - also we know indexing index=2 matlab ginne me 3 ok.

//for (int i= 0; i< num1.length + 1; i++) {     // ye loop 0 se lekar num1 ki length tak chalega usi bich agar i = index  aaya tu wo element us jagah print ho jayega
//    if(i < index){                            // i = 0 and 1  ke liye - 0 index(2) se choota hai tu wo as it is num2[i] me print ho jayega
//        num2[i] = num1[i];
//    } else if (i == index) {                  // i = 2 is not less than index the it will come down and check ki i == index, yes its true then in num2[i] it will print
//        num2[i] = element;
//    }
//    else {
//        num2[i] = num1[i - 1];                  // others left elements
//    }
//}
//for (int i = 0; i< num2.length; i++){
//    System.out.print(" " + num2[i]);
//}



//by taking input by user
//        int n,m;  // it is defining our size of an array
//        Scanner s = new Scanner(System.in);
//        System.out.println("enter the size of an array: ");
//        n = s.nextInt();   // it is storing size of an array
//        System.out.print("enter the array elements of size " + n);
//        int [] arr1 = new int[n];
//        int [] arr2 = new int[n + 1];
//        for (int i=0; i < arr1.length; i++) {
//            arr1[i] = s.nextInt();
//        }
//        System.out.println("enter the index value where inserting : ");
//        m = s.nextInt();
//        System.out.println("enter the element which you want to insert : ");
//        int element = s.nextInt();

//        for (int i=0; i<n + 1; i++){
//            if( i < m){
//                arr2[i] = arr1[i];
//            } else if (i == m) {
//                arr2[i] = element;
//            }
//            else{
//                arr2[i] = arr1[i - 1];
//            }
//        }
//        for (int i = 0; i< arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }




// Delete an element from an array
        // I am making an array
        int [] mynew = {20,12,14,53,55};
        // I am making new array with one less element than original array
        int [] newmyarr = new int[mynew.length - 1];
        // giving the index of the delete the element
        int index = 3;
        // moving all the elements of the array except the element to be deleted to the new array from the start index.
        for (int i=0; i< mynew.length; i++){
            if(i < index){          //  if element is less than index yes  (i = 0,1,2)
                newmyarr[i] = mynew[i];    // then it will print in new array ( print as it is 20,12,14)
            } else if (i == index) {         // now I got the same index to element ( i = 3)
                continue;                    // after got it so loop will be continue not end and i++(i will be 4)

            }
            else{                              // now print left array in new array
                newmyarr[i - 1] = mynew[i];      //  mera new array ke 4 - 1 ke jagah pe old array ka i print hojayega
            }
        }
        for(int i = 0; i<newmyarr.length ; i++){        // print the complete array
            System.out.println(" " + newmyarr[i]);
        }


        // deleting an elemnt by user input
//        int a;
//        Scanner sr = new Scanner(System.in);
//        System.out.println("enter the size of  an arrya : ");
//         a = sr.nextInt();
//        System.out.println("enter  the elements of array with size of : " + a);
//        int ages [] = new int[a];
//        int ages1 [] = new int [a - 1];
//        for(int i=0; i< ages.length; i++){
//            ages[i] = sr.nextInt();
//        }
//        System.out.println("enter the index number in which you want to delete: ");
//        int c = sr.nextInt();
//
//        for(int i=0; i< ages.length; i++){
//            if( i < c){
//                ages1[i] = ages[i];
//            } else if (i == c) {
//                continue;
//            }
//            else{
//                ages1[i  -1] = ages[i];
//            }
//        }
//        for(int i=0; i< ages.length -1; i++){
//            System.out.println(" " + ages1[i]);
//        }

    }
}
