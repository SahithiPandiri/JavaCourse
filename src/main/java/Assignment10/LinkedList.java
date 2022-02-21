package Assignment10;
import java.util.*;
class LinkedList{
    static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static  Node head=null,tail=null,temp2=null,temp,temp3;
    public static void create(int d){
        temp=new Node(d);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    public static void display(){
        temp2=head;
        while(temp2!=null){
            System.out.print(temp2.data+" -> " );
            temp2=temp2.next;
        }
    }
    public static void remove(){
        temp3=head;
        while(temp3.next.next!=null){
            temp3=temp3.next;
        }
        temp3.next=null;
    }
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            create(i);
        }
        display();
        remove();
        System.out.println();
        display();
    }
}

