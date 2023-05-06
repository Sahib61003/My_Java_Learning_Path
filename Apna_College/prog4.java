//Inheritance
class Shape{
    public void area(){
        System.out.println("Displays Area");

    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        int area = l * h * 1/2;
        System.out.println("Area of triangle:" + area);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l){
        int area = (int) (Math.sqrt(3)/4 * l * l);
        System.out.println("Area of equilateral triangle:" + area);
    }
}

class Circle extends Shape{
    public void area(int r){
        int area = (int) (Math.PI * r * r);
        System.out.println("Area of circle:" + area);
    }
}


public class prog4{
    public static void main(String args[]){
        Shape s = new Shape();
        s.area();

        Triangle t = new Triangle();
        t.area(10, 20);

        EquilateralTriangle et = new EquilateralTriangle();
        et.area(10);

        Circle c = new Circle();
        c.area(10);
    }
}