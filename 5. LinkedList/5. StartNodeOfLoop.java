/*
Description of Question : https://www.geeksforgeeks.org/find-first-node-of-loop-in-a-linked-list/
Input : 
  3
  1 8 4
  2
Output : 
  8
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
    
    void createLoop(int k){
        if(head==null || k==0) return ;
        Node temp = head;
        while(k!=1){
            temp = temp.next;
            k--;
        }
        tail.next = temp;
    }
    
    void removeLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break; 
        }
        if(slow!=fast) return;
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        while(slow.next!=fast) slow = slow.next;
        slow.next = null;
    }
    
    int FirstNodeLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break;
        }
        if(fast==null || fast.next==null) return -1;
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            l1.insertAtTail(sc.nextInt());
        }
        int k = sc.nextInt();
        l1.createLoop(k);
        System.out.println(l1.FirstNodeLoop(l1.head));
    }
}
