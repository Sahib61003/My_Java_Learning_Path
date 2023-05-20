import java.util.Scanner;

/* CONDITIONAL OPERATORS:
    * > greater than
    * < less than
    * >= greater than or equal to
    * <= less than or equal to
    * == equal to
    * != not equal to
 */

public class Conditional {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }


        System.out.print("Enter your grade: ");
        String gradestr = sc.next();
        char grade = gradestr.charAt(0);

        if (grade == 'A' ){
            System.out.println("You are a good student.");
        }
        else if (grade == 'B'){
            System.out.println("You are an average student.");
        }
        else if (grade == 'C'){
            System.out.println("You are a below average student.");
        }
        else{
            System.out.println("You are a bad student.");
        }
        sc.close();


    }
    
}
