// This class is used to get input from the user.
import java.util.Scanner;


public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("My name is " + name + " and age is " + age);
        sc.close();

    }   
}