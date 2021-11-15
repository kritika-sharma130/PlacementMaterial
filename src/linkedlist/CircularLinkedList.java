/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 10-11-2021
 *   Time: 11:20
 *   File: CircularLinkedList.java
 */

package linkedlist;

import java.util.NoSuchElementException;

public class CircularLinkedList {
    private ListNode last;
    private int length;

    public CircularLinkedList() {
        this.last = null;
        this.length = 0;
    }

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularLinkedList(ListNode last, int length) {
        this.last = null;
        this.length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void createCircularLinkedList(){
        ListNode first= new ListNode(1);
        ListNode second= new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;
        last=fourth;
    }
    public void display(){
        if(last==null){
            return;
        }
        ListNode first = last.next;
        while(first!=last){
            System.out.print(first.data+"---->");
            first=first.next;
        }
        System.out.print(first.data);
    }
    public void insertFirst(int data){
        ListNode temp= new ListNode(data);
        if(last==null){
            last=temp;
        }else{
            temp.next=last.next;//connect last node to first node
        }
        last.next=temp;
        length++;
    }
    public void insertLast(int data){
        ListNode temp= new ListNode(data);
        if(last==null){
            last=temp;
            last.next=last;
        }
        else{
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        length++;
    }
    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if(last.next==null){//check if only node is there
           last =null;
        }else {
            last.next=temp.next;
        }
        temp.next=null;
        length--;
        return temp;
    }


    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        /*
        cll.createCircularLinkedList();
        cll.insertFirst(1);
        cll.insertFirst(10);
        cll.insertFirst(100);
        cll.insertFirst(1000);
        */
        cll.insertLast(1);
        cll.insertLast(10);
        cll.insertLast(100);
        cll.insertLast(1000);
        cll.deleteFirst();
        cll.display();
    }
}
