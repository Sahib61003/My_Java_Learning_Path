public class Method {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(average(10,20));
        myMethod();

        myMethod("Liam");

        int z = myMethod(5);
        System.out.println(z);
    }
    //Static means that the method belongs to the MyMainClass class and not an object of the MyMainClass class.

    //Methods in Java
    public static void myMethod() {
        // code to be executed
    }

    //Methods with Parameters
    static void myMethod(String fname) {
        System.out.println(fname + " Hello");
    }

    //Methods with Parameters and Return Values
    static int myMethod(int x) {
        return 5 + x;
    }

    static int average(int first, int second){
        int sum = first + second;
        return sum/2;
    }





    
}
