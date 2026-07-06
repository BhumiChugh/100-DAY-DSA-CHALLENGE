import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Intersection_Array{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1=s.nextInt();
        
        int arr1[]= new int[n1];
         
        for(int i=0;i<n1;i++){
            System.out.print("Enter "+(i+1)+") element of first array: ");
            arr1[i]=s.nextInt();
        }
        
        System.out.print("Enter size of second array: ");
        int n2=s.nextInt(); 
        int arr2[]= new int[n2]; 
        
        for(int i=0;i<n2;i++){
            System.out.print("Enter "+(i+1)+") element of second array: ");
            arr2[i]=s.nextInt();
        }
       


        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> InterArr = new ArrayList<>();

        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                InterArr.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.print("Intersection of the two arrays: "+ InterArr);


        
    }
}

    