/*
Description of Question : https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
Example : 
  2
   \
    1
   /
 3
Input : 2 -1 1 3 -1 -1 -1
Output: 3  
*/

import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree(){
        root=null;
    }
    
    public Node createTree(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Data : ");
        int data = s.nextInt();
        if(data==-1){
            return null;
        }
        Node n = new Node(data);
        System.out.println("Left Part of "+data+": ");
        n.left = createTree();
        System.out.println("Right Part of "+data+" : ");
        n.right = createTree();
        return n;
    }
    
    public void createBinaryTree(){
        root = createTree();
    }
    
    int height(Node node) {
        if(node==null) return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
    
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        System.out.print("Height : "+bt.height(bt.root));
    }
}
