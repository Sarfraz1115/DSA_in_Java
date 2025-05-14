package Arrays;

public class Arrays_1D_Questions {
    public static void main(String[] args) {

        // Q.1 of Arrays
        // find the total number of  pairs in array whose sum is equal to 7 and answer is 2.
//        int arr [] = {4,6,3,5,8,2};
//        int target = 7;
//        int ans = 0;
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i] + arr[j] == target){
//                    ans++;
//                }
//            }
//        }
//        System.out.println(ans);





        // Q.2 ( in notebook Arrays questions ka Q.2 hai )
//        int arr1 [] = {1,4,5,6,3};
//        int target = 12;
//        int ans = 0;
//        for (int i=0; i< arr1.length; i++) {
//            for (int j= i + 1; j< arr1.length; j++){
//                for (int k = j + 1; k< arr1.length; k++){
//                    if(arr1[i] + arr1[j] + arr1[k] == target){
//                         ans++;
//                    }
//                }
//            }
//        }
//        System.out.println(ans);






        // Q.3
        // explanation already written in notebook
//        int [] q3 = {1,2,2,1,3};
//        for(int i=0; i<q3.length; i++){
//            for (int j = i+1; j<q3.length; j++){
//                if(q3[i] == q3[j]){
//                    q3[i] = -1;
//                    q3[j] = -1;
//                }
//            }
//        }
//        for (int i=0; i<q3.length; i++) {
//            if(q3[i] > 0){
//                System.out.println("There is an unique element at index " + i + " and element is " + q3[i]);
//            }
//        }






        // Q.4
        // ----- defining the array -------
//        int q4 [] = {9,8,9,6,5,8};
//        // create a variable with max name and given value is most less ( -2345677 )
//        int max = Integer.MIN_VALUE;
//        // traversing array and checking if any element is greater than max value so replace max value with element.
//        for (int i=0; i < q4.length; i++) {
//            if(q4[i] > max) {
//                max = q4[i];
//            }
//        }
//        // and now our max value will be max = 9 - because greatest value in array is 9.
//          // now replacing that max element with infinite
//        // so replacing that max value to most min value.  agar array ka element barabar hai max = 9 se tu wo hojayega min.
//        for(int i=0; i<q4.length; i++) {
//            if(q4[i] == max) {
//                q4[i] = Integer.MIN_VALUE;
//            }
//        }
//        // now our array wil be {-infinte, 8, -infinte, 6,5,8}
//        // and in last, we again check the largest so we will get the that second largest element and that element is 8.
//        int secondmax = Integer.MIN_VALUE;
//        for (int i=0; i < q4.length; i++) {
//            if(q4[i] > secondmax) {
//                secondmax = q4[i];
//            }
//        }
//        System.out.println("Your second largest element is " + secondmax);





        // Q.5 -
//        int[] q5 = {1, 5, 3, 4, 6, 3, 4};
//        int first = 0;
//        boolean found = false;
//        for (int i = 0; i < q5.length; i++) {
//            for (int j = i + 1; j < q5.length; j++) {
//                if (q5[i] == q5[j]) {
//                    first = q5[i];
//                    found = true;
//                    break;
//                }
//            }
//            if (found) {
//                break;
//            }
//        }
//            if (found) {
//                System.out.println("found the first element " + first);
//            } else {
//                System.out.println("not found");
//            }





// Q.6
        // swapping two elements
//        int a = 9;
//        int b = 10;
//        System.out.println("a " + a);
//        System.out.println("b " + b);
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("a " + a);
//        System.out.println("b " + temp);





        // Q.7 - Sort an array of only 0 and 1 elements ( question present in rough notebook )
        // its logic already in rough book.
//        int [] arr1 = {1,0,1,0,1,0,1,0,1};
//        int left = 0;
//        int right = arr1.length - 1;
//        while(left < right) {
//            if(arr1[left] == 1 && arr1[right] == 0){
//                int temp = arr1[left];
//                arr1[left] = arr1[right];
//                arr1[right] = temp;
//                left++;
//                right--;
//            }
//
//            if (arr1[left] == 0) {
//                left++;
//            }
//            if(arr1[right] == 1) {
//                right--;
//            }
//        }
//        for (int i=0; i< arr1.length; i++){
//            System.out.print(" " + arr1[i]);
//        }






        // Q.8 - question available in rough book in topic two pointers and question num is 5
//        int arr2 [] = {-10, -3,-2, 1, 4, 5};
//        int left = 0;
//        int right = arr2.length - 1;
//        int ansarr [] = new int[arr2.length];
//        int k=0;
//        while (left <= right){
//            if(Math.abs(arr2[left]) > Math.abs(arr2[right])){
//                ansarr[k] = arr2[left] * arr2[left];
//                k++;
//                left++;
//            }
//            else{
//                ansarr[k] = arr2[right] * arr2[right];
//                k++;
//                right--;
//            }
//        }
//        System.out.println("before array");
//        for (int i=0; i< arr2.length; i++){
//            System.out.print(" " + arr2[i]);
//        }
//        System.out.println("\nafter sorting array");
//        for(int i = ansarr.length - 1; i >= 0; i--){
//            System.out.print(" " + ansarr[i]);
//        }


        // Q.9 - Rotate the array by k steps where k is non-negative. ( Ques available on rough notebook and Q.6 is there)
//        int myarr [] = {1,2,3,4,5,6};
//        int n = myarr.length;
//        int k=4;
//        // defining the j=0 for the new array index
//        int j=0;
//        int newarr[] = new int[n];
//        for(int i=n-k; i<n; i++){
//            newarr[j] = myarr[i];
//            j++;
//        }
//        for (int i=0; i<=n-k-1; i++){
//            newarr[j] = myarr[i];
//            j++;
//        }
//        for (int i=0; i<newarr.length; i++){
//            System.out.print(" " + newarr[i] );
//        }


        // Q.7 - in rough notebook. upar ka alternative question
//        int a [] = {1,2,3,4,5,6,7};
//        int j = 0;
//        int n = a.length;
//        int k = 3;
//        int newarr [] = new int [a.length];
//        System.out.println("first array");
//        for (int i=0; i<n; i++){
//            System.out.print(" " + a[i]);
//        }
//        System.out.println();
//        System.out.println("reversing p1 and p2");
//        for (int i=n-k-1; i>=0; i--){
//            newarr[j] = a[i];
//            j++;
//        }
//        for (int i = n-1; i>=n-k; i--){
//            newarr[j] = a[i];
//            j++;
//        }
//        for (int i = 0; i<newarr.length; i++){
//            System.out.print(" " + newarr[i]);
//        }
//        System.out.println();
//        System.out.println("Desired Output");
//        for (int i=newarr.length-1; i>=0; i--){
//            System.out.print(" " + newarr[i]);
//        }



    }
}
