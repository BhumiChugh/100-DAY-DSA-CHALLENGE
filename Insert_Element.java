import java.util.Scanner;
public class Insert_Element{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int n=sc.nextInt();
        System.out.println();
        n+=1;
        int arr[]= new int[n];
        for(int i=0;i<(n-1);i++){
            System.out.print("Enter "+(i+1)+") element of the Array: ");
            arr[i]= sc.nextInt();
        }
        System.out.println();
        System.out.print("Array before inserting element: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter element you wish to insert: ");
        int e= sc.nextInt();
        System.out.print("Enter index at which you wish to insert the element: ");
        int index= sc.nextInt();
        System.out.println();
        for(int i=(n-1);i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=e;
        System.out.print("Array after inserting element: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}