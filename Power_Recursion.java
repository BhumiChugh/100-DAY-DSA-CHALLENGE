import java.util.Scanner;
public class Power_Recursion{
    static int power(int n,int p){
        if(p==0){
            return 1;}
        else{
                return n*power(n,p-1);
            }
        }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Enter the power: ");
        int p= sc.nextInt();
        power(n,p);
        System.out.println(n+" raised to the power "+p+" is: "+power(n,p));
    }
}