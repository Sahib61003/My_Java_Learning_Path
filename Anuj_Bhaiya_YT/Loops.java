
/*Types of Loops:
    1. For Loop
        for(initialization; condition; increment/decrement){
            //code to be executed
        }
    2. While Loop
        while(condition){
            //code to be executed
        }
    3. Do While Loop
        do{
            //code to be executed
        }while(condition);
*/

public class Loops {
    public static void main(String args[]){
        // For Loop
        System.out.println("For Loop:");
        for(int i=0; i<5; i++){
            System.out.println(i + " Sahib");
        }
        System.out.println();

        // While Loop
        System.out.println("While Loop:");
        int i = 6;
        while(i<11){
            System.out.println(i);
            i++;
        }
        System.out.println();

        // Do While Loop
        System.out.println("Do While Loop:");
        i = 10;
        do{
            System.out.println(i);
            i--;
        }while(i>5);
        System.out.println();

    }
    
}
