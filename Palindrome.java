import java.util.Scanner;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter text to check for palindrome: ");
        String s=sc.nextLine();
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        if(s.equals(r)){
            
            System.out.println("The given text is a palindrome!");
        }
        else{
            System.out.println("The given text is not a palindrome!");
        }
    }

}