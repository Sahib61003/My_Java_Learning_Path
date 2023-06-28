interface Shape {
void numberOfSides () ;
}
class Triangle implements Shape {
@Override
public void numberOfSides () {
System.out.println("A triangle has 3 sides.");
}
}
class Rectangle implements Shape {
@Override
public void numberOfSides() {
System.out.println("A rectangle has 4 sides.");
}
}
public class exp22 {
public static void main(String[] args) {
Triangle triangle = new Triangle();
triangle.numberOfSides();
Rectangle rectangle = new Rectangle();
rectangle.numberOfSides () ;
System.out.println("Sahib Preet Singh 00713211621 AI_ML");
}
}