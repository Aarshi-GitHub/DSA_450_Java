/*
Description of Question : https://leetcode.com/problems/search-a-2d-matrix/
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
*/
import java.util.*;

class SearchMatrix{
    
    static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0,j = matrix[0].length - 1 ;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]>target) j--;
            else i++;
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt(); // target element
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(searchMatrix(arr,k));
    }
}
