class Student{
    String name;
    int age;

    
    //Polymorphism
    //1. Compile Time Polymorphism
    //2. Run Time Polymorphism
    public void printInfo(String name){
        System.out.println(name);
    } 

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " and " + age);
    }
    
    /* convention print
        public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    */

    /* constructor user defined 
        Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //Copy Constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){
    }

    */
}


public class prog2 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Rohan";
        s1.age = 20;
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);

    }
}

