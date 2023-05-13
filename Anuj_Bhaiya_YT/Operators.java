public class Operators {
    /* Type of Operators in Java 
    1. Arithmetic Operators: +, -, *, /, %, ++, --
    2. Assignment Operators: =, +=, -=, *=, /=, %=
    3. Logical Operators: &&, ||, !
    4. Comparison Operators: ==, !=, >, <, >=, <=
    5. Bitwise Operators: &, |, ^, ~, <<, >>, >>>
    6. Ternary Operators: ?:
    7. Shift Operators: <<, >>, >>>
    8. Miscellaneous Operators: +, -, ++, --, new, delete, typeof, instanceof, new, this, super,
    */
    public static void main(String args[]){
    
        // Arithmetic Operators
        
        int first_num = 200;
        int second_num = 10;

        System.out.println("Addition: " + (first_num + second_num));
        System.out.println("Subtraction: " + (first_num - second_num));
        System.out.println("Multiplication: " + (first_num * second_num));
        System.out.println("Division: " + (first_num / second_num));
        System.out.println("Modulus: " + (first_num % second_num));
        //Pre-Increment
        System.out.println("Increment: " + (++first_num));
        System.out.println("Decrement: " + (--second_num));
        //Post-Increment
        System.out.println("Increment: " + (first_num++));
        System.out.println("Decrement: " + (second_num--));

        double sum = (double)first_num + (double)second_num;
        System.out.println("Sum: " + sum);

        // Assignment Operators
        int a = 10;
        char c = 'A';
        System.out.println(a + c);

    }
}
