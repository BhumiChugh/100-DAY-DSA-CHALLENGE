import java.util.Scanner;
public class Product_Except_Self{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n =sc.nextInt();
        int arr[]=new int[n];
       
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+") element of the Array: ");
            arr[i]=sc.nextInt();
        }
        System.out.print("The Array is: " );
        System.out.print("[");
        for(int i=0;i<n;i++){
            if(i!=(n-1)){
            System.out.print(arr[i]+",");}
            else{
                System.out.print(arr[i]+"]");
            }
        }

        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    p*=arr[j];
                }

            }
            arr1[i]=p;
        }
        System.out.println();
        System.out.print("Product Except Self Array is: " );
        System.out.print("[");
        for(int i=0;i<n;i++){
            if(i!=(n-1)){
            System.out.print(arr1[i]+",");}
            else{
                System.out.print(arr1[i]+"]");
            }
        }

    }
}