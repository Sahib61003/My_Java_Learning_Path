// Topic: Classes and Objects

class Pen{
    String color;
    String type;
    
    public void write(){
        System.out.println("Writing");    
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

public class prog1{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "Black";
        pen1.type = "Gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Ball";

        pen1.printColor();
        pen2.printColor();

    }
}