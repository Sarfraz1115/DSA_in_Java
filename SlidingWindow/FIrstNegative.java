package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FIrstNegative {
    static List<Integer> firstNegativeInteger(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        int N = arr.length;
        int[] res = new int[N - k + 1];

        // Process the first window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                q.add(i); // Store index
            }
        }
        res[0] = q.isEmpty() ? 0 : arr[q.peek()];

        // Process the remaining windows
        for (int i = 1; i < N - k + 1; i++) {
            // Remove indices that are out of the current window
            if (!q.isEmpty() && q.peek() < i) {
                q.poll();
            }

            // Add the current element if it's negative
            if (arr[i + k - 1] < 0) {
                q.add(i + k - 1);
            }

            // Store the result
            res[i] = q.isEmpty() ? 0 : arr[q.peek()];
        }

        // Convert array to list and return
        List<Integer> ll = new ArrayList<>();
        for (int num : res) {
            ll.add(num);
        }
        return ll;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        List<Integer> result = firstNegativeInteger(arr, k);
        System.out.println(result); // Output: [-1, -1, -7, -15, -15, 0]
    }
}
