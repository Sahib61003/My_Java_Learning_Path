public class VariableDatatype {
    // Variable: A container which stores the value/data
    //Rules of declaring a variable 
    //1. No space between variable name
    //2. No number at the beginning of the variable name
    //3. No special character except underscore(_) and dollar($)
    //4.. Variable name should be in camelCase
    //5. Variable name should not be a interface name, method name, class name and keyword.

    //Datatype: int, float, char, String, long, double, boolean, byte, short
    /* size of 
    int = 4 bytes
    float = 4 bytes
    char = 2 bytes
    String = 0 bytes
    long = 8 bytes
    double = 8 bytes
    boolean = 1 byte
    byte = 1 byte
    short = 2 bytes
    */
    public static void main(String[] args) {
        int a = 10;
        float b = 10.5f;
        char c = 'A'; //single quotes
        String d = "Hello World"; // double quotes
        long e = 1000000000000000000L;
        double f = 10.5;
        boolean g = true;
        byte h = 10;
        short i = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }
}
