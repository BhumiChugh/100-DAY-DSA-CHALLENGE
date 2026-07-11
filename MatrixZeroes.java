import java.util.ArrayList;
import java.util.Scanner;
public class MatrixZeroes{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows of Array: ");
        int r= sc.nextInt();
        System.out.print("Enter no. of columns of Array: ");
        int c= sc.nextInt();
        int arr[][]= new int[r][c];
        ArrayList <Integer> brr= new ArrayList<>();
      
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter element at position ["+i+"]["+j+"]:");
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==0){
                    brr.add(i);
                    brr.add(j);
                }
                
            }
        System.out.println();
        }
        System.out.println("The Array is:");
        System.out.print("[ ");
        for(int i=0;i<r;i++){
            System.out.print("[ ");
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
        System.out.print("] ");
        if(i!=r-1){
            System.out.println();
        }
        else{
            System.out.print("] ");
            System.out.println();
            }
        }
        System.out.println();
        
        for(int k=0;k<brr.size();k+=2){
            int r1=brr.get(k);
            int c1=brr.get(k+1);
            for(int i=0;i<r;i++){
                arr[i][c1]=0;
            }
            for(int j=0;j<c;j++){
                arr[r1][j]=0;
            }
        }
        System.out.println("After Applying Set Matrix Zeroes operation on given Array\nThe Array is:");
        System.out.print("[ ");
        for(int i=0;i<r;i++){
            System.out.print("[ ");
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
        System.out.print("] ");
        if(i!=r-1){
            System.out.println();
        }
        else{
            System.out.print("] ");
            System.out.println();
            }
        }
        System.out.println();
    }
}