import java.util.Scanner;

public class SymmetricMatrix{
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

        boolean check= true;
        if(r==c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]!=arr[j][i]){
                    check=false;
                    break;
                }
                if(check==false){
                    break;
                }
            }
        }
    }

        if(r!=c){
            System.out.println("The given matrix is not a square matrix, hence it cannot be symmetric.");
        }
        else if(check==true){
            System.out.println("The given matrix is symmetric.");
        }
        else{
            System.out.println("The given matrix is not symmetric.");
        }

    }
}