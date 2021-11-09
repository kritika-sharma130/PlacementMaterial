/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 13-10-2021
 *   Time: 00:47
 *   File: SinglyLinkedList.java
 */

package linkedlist;

public class SinglyLinkedList {
    ListNode head;
    int count = 0;

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            next = null;
        }
    }
    public void insertAtFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtLast(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
    }
    public ListNode deleteFirst(){
        if(head==null){
            return null;

        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return  temp;
    }
    public ListNode deleteAtLast(){
        if(head==null||head.next==null){
            return head;
        }
        ListNode previous=null;
        ListNode current=head;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }
    public void insertAtspecificPosition(int position,int value){
        ListNode node=new ListNode(value);
        if(position==1){
            node.next=head;
            head=node;
        }
        else{
            ListNode previous=head;
            int count=1;
            if(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            node.next=current;
            previous.next=node;

        }
    }
    public void deleteAtSpecificPosition(int position) {
        try {
            if (position == 1) {
                head = head.next;
            } else  {
                ListNode previous = head;
                int count = 1;
                if (count < position - 1) {
                    previous = previous.next;
                    count++;
                }
                ListNode current = previous.next;
                previous.next = current.next;
            }


        }
        catch(Exception e){
            System.out.println("Not present");
        }
    }
    public ListNode MiddleNode(){
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }
        return slowPtr;
        // this will give the reference of the middle node.
        // To fetch its data write slowPtr.data and change the return type of the function to int.
    }


    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    //find the length
    public void count() {
        if (head == null) {
            System.out.println("length is 0");
        } else {
            ListNode current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            System.out.println(count);
        }
    }
    public ListNode removeDuplicates(){
        ListNode current=head;
        while(current!=null && current.next!=null){
           if(current.data == current.next.data){
               current.next = current.next.next;
           }else{
               current=current.next;
           }
        }
        return head;
    }
    public ListNode insertInSortedList(int n) {
        ListNode current = head;
        ListNode newNode = new ListNode(n);
        ListNode temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }
    public ListNode getNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value of n" + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n) {
            if (refPtr == null) {
                throw new IllegalArgumentException(n + "is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }


}

 class Insertion {
    public static void main(String[] args) {
        SinglyLinkedList obj=new SinglyLinkedList();
        obj.head=new SinglyLinkedList.ListNode(1);
        obj.insertAtFirst(2);
        obj.insertAtFirst(2);
        obj.insertAtFirst(2);
        obj.insertAtFirst(3);
        //obj.insertAtLast(3);
        //obj.insertAtLast(7);
        //System.out.println(obj.deleteFirst().data);
        //obj.deleteAtLast();
        //obj.insertAtspecificPosition(1,5);
        //obj.insertAtspecificPosition(2,6);
        //obj.deleteAtSpecificPosition(1);
        //System.out.println(obj.MiddleNode());
        //obj.insertInSortedList(4);
        //obj.removeDuplicates();
        obj.getNthNodeFromEnd(2);//This returns the entire node
        System.out.println(obj.getNthNodeFromEnd(2).data);//This gives the value of nth node from end
        obj.display();
        //obj.count();

    }
}

