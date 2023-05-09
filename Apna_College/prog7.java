interface Animal{
    int eyes = 2;
    void walk();
    void eat();
}

interface Herbivore{
    void eatPlants();
}

class Horse implements Animal, Herbivore {
    public void walk(){
        System.out.println("Horse is walking");
    }
    public void eat(){
        System.out.println("Horse eats");
    }
    public void eatPlants(){
        System.out.println("Horse eats plants");
    }
}

public class prog7 {
    public static void main(String args[]){
        Horse h = new Horse();
        h.walk();
        h.eat();
        h.eatPlants();
    }
}
