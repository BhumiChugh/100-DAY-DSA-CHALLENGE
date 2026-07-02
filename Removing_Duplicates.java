import java.util.Scanner;
public class Removing_Duplicates{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n =sc. nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the elements of array: ");
            arr[i]=sc.nextInt();
        }
        // printing original array
        System.out.print("Original array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        
        int i=0;
        int j=1;
        while(j<n){
            if(arr[j]!=arr[i]) {
            i++;
            arr[i]=arr[j];
            j++;}

            else{
                j++;}
            }
            
        
        System.out.println();
        System.out.println("Array after removing Duplicates: ");
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}