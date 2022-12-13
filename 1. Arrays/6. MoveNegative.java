/*
Link to Question : https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/

Input: 
9
-12 11 -13 -5 6 -7 5 -3 -6
Output: -12 -13 -5 -7 -3 -6 5 6 11 

*/

import java.util.*;

class MoveNegative{
    
    private static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int neg=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){ 
                swap(arr,neg,i);
                neg++;
            }
        }
        for(int ele : arr)
            System.out.print(ele+" ");
    }
}
