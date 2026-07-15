import java.util.*;

public class ClosestToZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+(i+1)+")  element: ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int left = 0, right = n - 1;
        int minSum = Integer.MAX_VALUE;
        int resLeft = 0, resRight = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

           
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                resLeft = arr[left];
                resRight = arr[right];
            }

            if (sum < 0) {
                left++;   
            } else {
                right--;  
            }
        }

        System.out.println("\nPair with sum closest to zero: " + resLeft + " " + resRight);
        System.out.println("Sum = " + minSum);
    }
}