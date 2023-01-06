/*
Description of Question : https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1
Input:
        10
     /      \
    20       30
  /   \
 40   60
Input : 10 20 40 -1 -1 60 -1 -1 30 -1 -1
Output: 40 60 20 30 10
Explanation:
Traversing level 2 : 40 60
Traversing level 1 : 20 30
Traversing level 0 : 10
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
    
    public void reverselevelOrderTraversal(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.peek();
            System.out.print(temp.data+" ");
            q.remove();
            if(temp.right!=null) q.add(temp.right);
            if(temp.left!=null) q.add(temp.left);
        }
    }
    
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.root = bt.createTree();
        bt.reverselevelOrderTraversal(bt.root);
    }
}
