import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
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
        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;

        StringBuilder result = new StringBuilder();
        System.out.println("The Spiral Order of the given matrix is:");

        while (top <= bottom && left <= right) {

            // left se right (top row)
            for (int j = left; j <= right; j++) {
                result.append(arr[top][j]).append(" ");
            }
            top++;

            // top se bottom (right column)
            for (int i = top; i <= bottom; i++) {
                result.append(arr[i][right]).append(" ");
            }
            right--;

            // right se left (bottom row) - agar row bachi ho
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.append(arr[bottom][j]).append(" ");
                }
                bottom--;
            }

            // bottom se top (left column) - agar column bacha ho
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.append(arr[i][left]).append(" ");
                }
                left++;
            }
        }

        System.out.println(result.toString().trim());
    }
}