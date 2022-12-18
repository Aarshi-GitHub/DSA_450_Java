/*
Description of Question : https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
Input:
LinkedList: 4->5->6
Output: 457 
*/

import java.util.*;

class LinkedList{
    Node head = null;
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
        Node temp = head;
        while(temp.next!=null) temp = temp.next;
        temp.next = new Node(val);
    }
    
    void calcSum(Node head){
        Node temp = head;
        Node lastNode = null;
        int carry = 1;
        while(temp!=null){
            if(temp.next==null) lastNode = temp;
            int sum = temp.data + carry;
            carry = sum/10;
            temp.data = sum%10;
            if(carry==0) return;
            temp = temp.next;
        }
        lastNode.next = new Node(carry);
    }
    
    Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
    void addOne() { 
        head = reverse(head);
        calcSum(head);
        head = reverse(head);
    }
    
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        LinkedList l1 = new LinkedList();
        for(int i=0;i<s.length();i++){
            l1.insertAtHead(n%10);
            n/=10;
        }
        l1.addOne();
        l1.display();
    }
}
