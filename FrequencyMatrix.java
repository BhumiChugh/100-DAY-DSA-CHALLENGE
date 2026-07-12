import java.util.HashSet;
import java.util.Scanner;
public class FrequencyMatrix{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashSet <Integer> hset = new HashSet<>();
        for( int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+") element of the array: ");
            arr[i]=sc.nextInt();
            hset.add(arr[i]);
        }
        System.out.println();
        System.out.print("Array is: ");
        for( int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Frequency of each elements are: ");
        Integer[] tempArr = hset.toArray(new Integer[0]);
        for(int i=0;i<tempArr.length;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(tempArr[i]==arr[j]){
                    c++;
                }
            }
            System.out.print(tempArr[i]+":"+c+" ");
        }
        

    }
}