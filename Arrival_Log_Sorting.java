import java.util.ArrayList;
import java.util.Scanner;
public class Arrival_Log_Sorting{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of server Log1: ");
        int n =sc. nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter entries in server Log1: ");
            arr[i]=sc.nextInt();
        }
        // printing original array
        System.out.print("1st Server Logs : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Enter size of server Log2: ");
        int m =sc. nextInt();
        int brr[]=new int[m];
        for(int i=0;i<m;i++){
            System.out.print("Enter entries in server Log2: ");
            brr[i]=sc.nextInt();
        }
        // printing original array
        System.out.print("2nd Server Logs : ");
        for(int i=0;i<m;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        ArrayList<Integer> crr = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n && j<m){
                if(arr[i]<brr[j]){
                    crr.add(arr[i]);
                    i++;
                }
                else{
                    crr.add(brr[j]);
                    j++;
                }

            if(i>=n){
                while(j<m){
                    crr.add(brr[j]);
                    j++;
                }
            }

            else if(j>=m){
                while(i<n){
                    crr.add(arr[i]);
                    i++;
                }
            }

            
        }

        System.out.print("Sorted Server Logs : ");
        System.out.println(crr);
    }
}