abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("Animal is created");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse is created");
    }
    public void walk(){
        System.out.println("Horse is walking");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Chicken is walking");
    }
}

public class prog6 {
    public static void main(String args[]){
        Horse h = new Horse();
        h.walk();
        h.eat();
        Chicken c = new Chicken();
        c.walk();
        /* can't create animal object because it is absract 
        Animal animal = new Animal();
        animal.walk();
        //if we run this, then error:
        //prog6.java:80: error: Animal is abstract; cannot be instantiated
        */
    }
}
