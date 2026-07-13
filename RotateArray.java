import java.util.Scanner;
public class RotateArray{

    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        for( int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+") element of the array: ");
            arr[i]=sc.nextInt();
           
        }
        System.out.println();
        System.out.print("Array is: ");
        for( int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Enter how many rotations you want: ");
        int r= sc.nextInt();
        for(int i=0;i<r;i++){
            int temp=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.println();
        System.out.print("After rotation Array is: ");
        for( int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}