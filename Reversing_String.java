import java.util.Scanner;
public class Reversing_String{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Code Name: ");
        String s= sc.nextLine();
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        System.out.println("Original Code Name was: "+s);
        System.out.println("After reversing Code Name is: "+r);
    }
}