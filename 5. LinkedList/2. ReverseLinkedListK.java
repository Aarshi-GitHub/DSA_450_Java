/*
Description of Question : https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
Input:
LinkedList: 1->2->2->4->5->6->7->8
K = 4
Output: 4 2 2 1 8 7 6 5 
*/

import java.util.*;

class LinkedList{
    
    Node head = null;
    Node tail = null;
    
    static class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    
    void insertAtHead(int val){
        if(head==null){
           head = new Node(val);
           tail = head;
        } 
        else{
            Node temp = new Node(val);
            temp.next=head;
            head = temp;
        }
    }
    
    void insertAtTail(int val){
        if(head==null){
            insertAtHead(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        tail = tail.next;
    }
    
    void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    Node reverseK(Node node, int k){
        if(node==null) return node;
        Node prev = null;
        Node cur = node;
        Node nxtptr = null;
        int count=0;
        while(cur!=null && count<k){
            nxtptr = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxtptr;
            count++;
        }
        if(nxtptr!=null) node.next = reverseK(nxtptr,k);
        return prev;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            l1.insertAtTail(sc.nextInt());
        }
        int k = sc.nextInt();
        l1.head = l1.reverseK(l1.head,k);
        l1.display(l1.head);
    }
}
