import java.util.Scanner;
public class Deleting_Element{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int n=sc.nextInt();
        System.out.println();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+") element of the Array: ");
            arr[i]= sc.nextInt();
        }
        System.out.println();
        System.out.print("Array before deleting element: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter which position element you wish to delete: ");
        int p= sc.nextInt();
        System.out.println();
        arr[p-1]=0;
        for(int i=(p-1);i<(n-1);i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=0;
        System.out.print("Array after deleting element at pos "+p+": ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}