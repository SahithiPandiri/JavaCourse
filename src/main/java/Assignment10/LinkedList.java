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
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.println("1.Insert");
            System.out.println("2.Remove");
            System.out.println("3.Display");
            System.out.println("4.End");
            System.out.println("Enter Choice");
            int n = sc.nextInt();
            int k = 0;
            switch (n) {
                case 1:
                    System.out.println("Enter Number to be Inserted");
                    create(sc.nextInt());
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    k = 1;
                    break;
            }
            if (k == 1) {
                break;
            }
        }
// LinkedList Without Implementing List Interface
    }
}

