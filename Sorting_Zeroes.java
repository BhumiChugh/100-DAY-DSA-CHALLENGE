import java.util.Scanner;
public class Sorting_Zeroes{
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

        // two pointer technique + MY TECHNIQUE
        int i=0;
        
        int j=0;
        while(j<n){
            if(arr[j]!=0 ){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j++;}

            else{
                j++;}
            }
            
        
        System.out.println();
        System.out.println("Array after segregation: ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}