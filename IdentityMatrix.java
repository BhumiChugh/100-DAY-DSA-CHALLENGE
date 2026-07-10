import java.util.Scanner;

public class IdentityMatrix{
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
        boolean check=true;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((i==j && arr[i][j]==1) || (i!=j && arr[i][j]==0)){
                    check=true;
                }
                else 
                {
                    check=false;
                    break;
                }
            }
            if(check==false){
                break;
            }
        }
        if(check==true){
            System.out.println("The given matrix is an Identity matrix.");
        }
        else{
            System.out.println("The given matrix is not an Identity matrix.");
        }
    }
}