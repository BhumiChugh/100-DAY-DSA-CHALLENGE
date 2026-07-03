

import java.util.Scanner;
public class Fibonacci_Element{
    static int fib(int n) {
    if (n <= 1) return n;
    return fib(n-1) + fib(n-2);
}
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter position whose fibonacci number you want: ");
        int n=sc.nextInt();
        n+=1;
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= fib(i);
        }
        System.out.print("Fibonacci series upto position "+(n-1)+" is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Fibonacci number at position "+(n-1)+" is: "+arr[n-1]);
    }
}
        