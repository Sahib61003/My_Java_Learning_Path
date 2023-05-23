import java.util.Scanner;

/* Logical Operator:
    * && and
    * || or
    * ! not
*/

public class Logical {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your country: ");
        String country = sc.next();
        if (age >= 18 && country.equalsIgnoreCase("India")){
            System.out.println("You are eligible to vote.");
        }
        else if ( country.equalsIgnoreCase("Nepal") || age >= 18 ){
            System.out.println("You are eligible to vote in India.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
        if ( !(age >= 18 && country.equalsIgnoreCase("India"))){
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}
