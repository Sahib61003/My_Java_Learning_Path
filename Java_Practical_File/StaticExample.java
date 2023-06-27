public class StaticExample {
// Static variable
private static int staticVariable = 20;
// static block
static {
System.out.println("Inside the static block");
staticVariable = 15;
}
// Static method
public static void staticMethod() {
System.out.println("Inside the static method");
System.out.println("Static variable value: " + staticVariable);
}
// Static nested class
static class StaticNestedclass {
public void display() {
System.out.println("Inside the static nested class");
System.out.println("Static variable value: " + staticVariable);
}
}
public static void main(String[] args) {
// Accessing static variable
System.out.println("static variable value: " + staticVariable);
// Accessing static method
staticMethod();
// Accessing static nested class
StaticNestedclass nestedclass = new StaticNestedclass();
nestedclass.display();
System.out.println("Sahib Preet Singh 0071321621 AI_ML");
}
}