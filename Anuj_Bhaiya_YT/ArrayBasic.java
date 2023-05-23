import java.util.Scanner;

public class ArrayBasic {
    public static void main(String args[]){
        
        System.out.println("Array");
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 students:");
        for (int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }

        for (int i=0; i<marks.length; i++){
            System.out.println("Marks of Subject " + (i+1) + " : " + marks[i]);
        }

        System.out.println("2D Array/ Matrix");

        int a[][] = new int[2][3];
        System.out.println("Enter the elements of 2x3 matrix:");
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
