/*
Description of Question : https://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/

Input: arr1[] = {1, 3, 4, 5, 7}
       arr2[] = {2, 3, 5, 6} 
Output: Union : {1, 2, 3, 4, 5, 6, 7} 
        Intersection : {3, 5}
Time Complexity : O(n+m)
Constant Space
*/
import java.util.*;

class UnionIntersection{
    
    public static void findUnion(int arr[],int n,int brr[],int m){
        System.out.print("Union : ");
        int i=0,j=0;
        while(i<n && j<m){
            while(i<n-1 && arr[i]==arr[i+1]) i++;
            while(j<m-1 && brr[j]==brr[j+1]) j++;
            if(i<n && j<m && arr[i]==brr[j]){
                System.out.print(arr[i]+" ");
                i++;j++;
            }
            else if(i<n && j<m && arr[i]<brr[j]){
                System.out.print(arr[i++]+" ");
            }
            else if(i<n && j<m && arr[i]>brr[j]){
                System.out.print(brr[j++]+" ");
            }
        }
        while(i<n){
            while(i<n-1 && arr[i]==arr[i+1]) i++;
            System.out.print(arr[i++]+" ");
        }
        while(j<m){
            while(j<m-1 && brr[j]==brr[j+1]) j++;
            System.out.print(brr[j++]+" ");
        }
    }
    
    public static void findInter(int arr[],int n,int brr[],int m){
        System.out.print("\nIntersection : ");
        int i=0,j=0;
        while(i<n && j<m){
            while(i<n-1 && arr[i]==arr[i+1]) i++;
            while(j<m-1 && brr[j]==brr[j+1]) j++;
            if(i<n && j<m && arr[i]==brr[j]){
                System.out.print(arr[i]+" ");
                i++;j++;
            }
            else if(i<n && j<m && arr[i]<brr[j]) i++;
            else if(i<n && j<m && arr[i]>brr[j]) j++;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        int brr[] = new int[m];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<m;i++) brr[i] = sc.nextInt();
        findUnion(arr,n,brr,m);
        findInter(arr,n,brr,m);
    }
}
