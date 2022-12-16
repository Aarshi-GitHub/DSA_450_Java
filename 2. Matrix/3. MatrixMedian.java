/*
Description of Question : https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1
Input:
R = 3, C = 3
M = [[1, 3, 5], 
     [2, 6, 9], 
     [3, 6, 9]]
Output: 5
Explanation: Sorting matrix elements gives 
us {1,2,3,3,5,6,6,9,9}. Hence, 5 is median. 
*/

import java.util.*;

class MatrixMedian{
    
    static int median(int matrix[][], int R, int C) {
        int mini = Integer.MAX_VALUE,maxi = Integer.MIN_VALUE;
        for(int i=0;i<R;i++){
            mini = Math.min(matrix[i][0],mini);
            maxi = Math.max(matrix[i][C-1],maxi);
        }
        int num = (R*C + 1)/2;
        while(mini<=maxi){
            int mid = mini + (maxi-mini)/2;
            int count=0;
            int get=0;
            for(int i=0;i<R;i++){
                get = Arrays.binarySearch(matrix[i],mid);
                if(get<0){
                    get = Math.abs(get) - 1;
                }
                else{
                    while(get<C && matrix[i][get]==mid) get++;
                }
                count+=get;
            }
            if(count<num) mini = mid+1;
            else maxi = mid-1;
        }
        return mini;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(median(arr,n,m));
    }
}
