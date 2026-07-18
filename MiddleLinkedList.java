import java.util.Scanner;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }}
public class MiddleLinkedList{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("How many nodes do you want: ");
        int n = sc.nextInt();
        Node head=null;
        Node tail=null;
       
        for(int i=0;i<n;i++){
            System.out.print("Enter node values: ");
            int v = sc.nextInt();
            Node temp = new Node(v);   
            if(head == null){
                head=temp;
                tail=temp;
            }
            else {
                if(tail!=null){
                tail.next=temp;
                tail=temp;}
            }   
        }
        System.out.print("The Linked List formed is: ");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.print("Middle element in this list is: ");
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            if(slow!=null)
            {slow=slow.next;}
            
            fast=fast.next.next;

        }
        if(slow != null){
    System.out.println(slow.val);
}
else System.out.println("null");
    }
}