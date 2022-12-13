/*
link to Question : https://www.geeksforgeeks.org/kth-smallest-largest-element-in-unsorted-array/
Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7
Approach 1 : Sorting array and accessing the (n-k)th element in array.
Time Complexity : O(nlogn) sorting of array
Space Complexity: O(1)
Approach 2 : Using a Min Priority Queue of  max size k .
Time complexity : O(nlogk) Priority queue of size k
Space Complexity : O(k)
*/

import java.util.*;

class KthMaxEleArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
            if(pq.size()>k) pq.poll();
        }
        System.out.println("kth Maximum element is : "+pq.peek());
    }
}
