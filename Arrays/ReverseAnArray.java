/* link to Question :  https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/ 
Reverse the Array.

Input Description : First Line conatins value n size of array and next line contains n space separated integers

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}

*/

import java.util.*;

class ReverseArray{
    
    private static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int s = 0;
        int e = n-1;
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
}
