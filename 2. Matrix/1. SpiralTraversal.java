/*
Description of Question : https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
*/

import java.util.*;

class SpiralTraversal{
    
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
        ArrayList<Integer> res = new ArrayList<>();
        int rowS = 0;
        int rowE = r-1;
        int colS = 0;
        int colE = c-1;
        while(rowS<=rowE && colS<=colE){
            for(int col = colS;col<=colE;col++)
                res.add(matrix[rowS][col]);
            rowS++;
            for(int row = rowS;row<=rowE;row++)
                res.add(matrix[row][colE]);
            colE--;
            if(rowS<=rowE){
                for(int col = colE;col>=colS;col--)
                    res.add(matrix[rowE][col]);
                rowE--;
            }
            if(colS<=colE){
                for(int row = rowE;row>=rowS;row--)
                    res.add(matrix[row][colS]);
                colS++;
            }
            
        }
        return res;
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
        ArrayList<Integer> res = spirallyTraverse(arr,n,m);
        for(int ele : res) System.out.print(ele+" ");
    }
}
