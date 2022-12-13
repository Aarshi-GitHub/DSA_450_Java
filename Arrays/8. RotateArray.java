/*
Description of Question : https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
Time Complexity : O(n)
Constant Space
*/
import java.util.*;

class RotateArray{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int temp = arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[(i+1)%n] = arr[i];
        }
        arr[0] = temp;
        for(int ele : arr) System.out.print(ele+" ");
    }
}
