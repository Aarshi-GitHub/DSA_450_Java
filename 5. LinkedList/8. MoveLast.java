/*
Description of Question : https://www.geeksforgeeks.org/move-last-element-to-front-of-a-given-linked-list/
Input: 1->2->3->4->5
Output: 5->1->2->3->4
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
    
    Node removeDuplicates() {
        if(head==null || head.next==null) return head;
        HashSet<Integer> s = new HashSet<>();
        s.add(head.data);
        Node temp = head;
        while(temp!=null && temp.next!=null){
            if(temp.next!=null && s.contains(temp.next.data)){
                temp.next = temp.next.next;
            }
            else{
                s.add(temp.next.data);
                temp = temp.next;
            }
        }
        return head;
    }
    
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    void moveLast(){
        if(head==null || head.next==null) return;
        Node prev = null;
        Node temp = head;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        temp.next = head;
        head = temp;
        prev.next = null;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            l1.insertAtTail(sc.nextInt());
        }
        l1.moveLast();
        l1.display();
    }
}
