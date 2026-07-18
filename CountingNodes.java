import java.util.Scanner;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }}
public class CountingNodes{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Node head=null;
        Node tail=null;
        
        int q;
        do{
            System.out.print("Add element to list?( 1(yes)/ 0(no) )");
            q=sc.nextInt();
            
            if(q==1){
                System.out.print("Enter node value: ");
                int v = sc.nextInt();
                Node temp = new Node(v);   
                if(head == null){
                    head=temp;
                    tail=temp;
                }
                else {
                    if(tail!=null){
                    tail.next=temp;}
                    tail=temp;
                }   
            }
        } while(q==1);
        if(head==null){System.out.println("No linkedlist formed");}
        else System.out.println("The Linked List formed is: ");
        Node temp=head;
        int count=0;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
            count++;
        }
        
        System.out.println("Total nodes: " + count);
    }
}