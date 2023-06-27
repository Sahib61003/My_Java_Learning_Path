interface Shape {
    void numberOfSides();
}

class Trapezoid implements Shape {
    @Override
    public void numberOfSides() {
        System.out.println("Trapezoid has 4 sides.");
    }
}

class Triangle implements Shape {
    @Override
    public void numberOfSides() {
        System.out.println("Triangle has 3 sides.");
    }
}

class Pentagon implements Shape {
    @Override
    public void numberOfSides() {
        System.out.println("Pentagon has 5 sides.");
    }
}

class Hexagon implements Shape {
    @Override
    public void numberOfSides() {
        System.out.println("Hexagon has 6 sides.");
    }
}

public class exp23 {
    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.numberOfSides();

        Triangle triangle = new Triangle();
        triangle.numberOfSides();

        Pentagon pentagon = new Pentagon();
        pentagon.numberOfSides();

        Hexagon hexagon = new Hexagon();
        hexagon.numberOfSides();
        System.out.println("Sahib Preet Singh 00713211621 AI_ML");
    }
}
