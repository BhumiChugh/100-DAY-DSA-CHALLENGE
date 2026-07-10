import java.util.Scanner;

public class ImageRotate{
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows of Array: ");
        int r= sc.nextInt();
        System.out.print("Enter no. of columns of Array: ");
        int c= sc.nextInt();
        int arr[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter element at position ["+i+"]["+j+"]:");
                arr[i][j]=sc.nextInt();
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
        if(i!=(r-1)){
            System.out.print("] ");
            System.out.println();
        }
        else{
            System.out.print("] ] ");
            }
        }

        System.out.println();
        int arr1[]=new int[r*c];
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[k]=arr[i][j];
                k++;
            }
        }
        int index=r;
        int l=0;
        k=0;
        while(k<(r*r)){
             int j=0;
        for(int i=k;i<index;i++){
                arr[j][r-l-1]= arr1[i]; 
                j++; 
        }
        k+=r;
        index+=r;
        l++;
        }
        // for(int i=0;i<(r*r);i++){
        //     System.out.print(arr1[i]+" ");
        // }

        System.out.println("The rotated Array is:");
        System.out.print("[ ");
        for(int i=0;i<r;i++){
            System.out.print("[ ");
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
        if(i!=(r-1)){
            System.out.print("] ");
            System.out.println();
        }
        else{
            System.out.print("] ] ");
            }
        }

        System.out.println();

    }
}