import java.util.Scanner;

public class SubarraySumZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    count++;
                    // Ye subarray print karo (index i se j tak)
                    System.out.print("Subarray " + count + ": [");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k]);
                        if (k != j) System.out.print(", ");
                    }
                    System.out.println("]");
                }
            }
        }

        System.out.println("\nCount of zero-sum subarrays: " + count);
        
    }
}