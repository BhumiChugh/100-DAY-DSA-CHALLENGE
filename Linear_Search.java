import java.util.Scanner;
public class Linear_Search{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        System.out.println();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+") element of the Array: ");
            arr[i]= sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter number you wish to search in the Array: ");
        int s=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==s){
                System.out.print("Number found!\nAt array index "+i);
                break;
            }
            else{c+=1;}
        }
        System.out.println();
        c+=1;
        if(c<=n){
        System.out.println("Number found after "+(c)+" linear searches");}
        else if(c==0 || c>n){
            System.out.println("Number not found in the array!");
        }
    }
}