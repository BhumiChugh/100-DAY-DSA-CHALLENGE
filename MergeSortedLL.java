import java.util.Scanner;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }}
public class MergeSortedLL{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("How many nodes do you want in LL1: ");
        int n1 = sc.nextInt();
        Node head1=null;
        Node tail1=null;
        
        for(int i=0;i<n1;i++){
            System.out.print("Enter LL1 node values: ");
            int v1 = sc.nextInt();
            Node temp1 = new Node(v1);   
            if(head1 == null){
                head1=temp1;
                tail1=temp1;
            }
            else {
                if(tail1!=null){
                tail1.next=temp1;
                tail1=temp1;}
            }   
        }
        System.out.print("The Linked List 1 formed is: ");
        Node temp1=head1;
        while(temp1!=null){
            System.out.print(temp1.val+" ");
            temp1=temp1.next;
        }
        

        //ll2

System.out.println();
        System.out.print("How many nodes do you want in LL2: ");
        int n2 = sc.nextInt();
        Node head2=null;
        Node tail2=null;
        
        for(int i=0;i<n2;i++){
            System.out.print("Enter LL2 node values: ");
            int v2 = sc.nextInt();
            Node temp2 = new Node(v2);   
            if(head2 == null){
                head2=temp2;
                tail2=temp2;
            }
            else {
                if(tail2!=null){
                tail2.next=temp2;
                tail2=temp2;}
            }   
        }
        System.out.print("The Linked List 2 formed is: ");
        Node temp2=head2;
        while(temp2!=null){
            System.out.print(temp2.val+" ");
            temp2=temp2.next;
        }
        System.out.println();
        System.out.println("Merging these Sorted LinkedLists: ");
        Node head3=null;
        Node tail3=null;
        Node i=head1;
        Node j=head2;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                Node temp3= new Node(i.val);
                if(head3==null){
                    head3=temp3;
                    tail3=temp3;
                }
                else{ if(tail3!=null){
                    tail3.next=temp3;
                    tail3=temp3;
                }}
                i=i.next;
                
                
            }
            else {
                Node temp3= new Node(j.val);
                if(head3==null){
                    head3=temp3;
                    tail3=temp3;
                }
                else{ if(tail3!=null){
                    tail3.next=temp3;
                    tail3=temp3;
                }}
                j=j.next;

            }
           
        }

        if(i==null){
            while(j!=null){
                Node temp3= new Node(j.val);
                if(head3==null){
                    head3=temp3;
                    tail3=temp3;
                }
                else{ if(tail3!=null){
                    tail3.next=temp3;
                    tail3=temp3;
                }}
                j=j.next;
            }
        }
        else if(j==null){
            while(i!=null){
            Node temp3= new Node(i.val);
                if(head3==null){
                    head3=temp3;
                    tail3=temp3;
                }
                else{ if(tail3!=null){
                    tail3.next=temp3;
                    tail3=temp3;
                }}
                i=i.next;
        }}

        Node temp3=head3;
        while(temp3!=null){
            System.out.print(temp3.val+" ");
            temp3=temp3.next;
        }

    }
}