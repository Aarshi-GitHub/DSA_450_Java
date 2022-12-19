/*
Description of Question : https://practice.geeksforgeeks.org/problems/implement-queue-using-array/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
*/

import java.util.*;

class Queue<T>{
    int front;
    int rear;
    int size;
    ArrayList<T> arr;
    Queue(int size){
        this.size = size;
        arr = new ArrayList<T>(size);
        front = -1;
        rear = -1;
    }
    void enqueue(T obj){
        if(rear==size-1){
            System.out.println("Queue Overflow..");
            return;
        }
        if(front==-1) front++;
        arr.add(obj);
        System.out.println(String.valueOf(obj)+" is Added to Queue");
        rear++;
    }
    
    T front(){
        if(front==-1){
            System.out.println("Queue Underflow");
            return null;
        }
        return arr.get(front);
    }
    T rear(){
        if(rear==-1){
            System.out.println("Queue Underflow");
            return null;
        }
        return arr.get(rear);
    }
    
    void dequeue(){
        if(front==-1){
            System.out.println("Queue Underflow");
            return ;
        }
        front++;
        if(front>rear){
            front = -1;
            rear = -1;
        }
    }
    boolean isEmpty(){
        return front==-1;
    }
}

class QueueUsingArray{
    public static void main(String[] args) {
        Queue<Integer> s = new Queue<Integer>(5);
        s.enqueue(1);
        s.enqueue(2);
        s.enqueue(3);
        System.out.println("Front : "+s.front());
        System.out.println("Rear : "+s.rear());
        s.dequeue();
        s.dequeue();
        System.out.println("Front : "+s.front());
        System.out.println("isEmpty() : "+s.isEmpty());
        s.dequeue();
        s.dequeue();
        System.out.println("isEmpty() : "+s.isEmpty());
    }
}
