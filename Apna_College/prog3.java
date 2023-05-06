class Shape{
    String color;
}

//Inheritance
class Triangle extends Shape{

}
public class prog3 {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.color = "Red";
        System.out.println(t1.color);
    }
}
