
class Student{
    static String school;
    String name;
}


public class prog8 {
    public static void main(String args[]){
        Student.school = "MGPS";
        Student s1 = new Student();
        s1.name = "Rohan";
        Student s2 = new Student();
        s2.name = "Rohit";

        System.out.println(s1.name + " studies in " + Student.school);
        System.out.println(s2.name + " studies in " + Student.school);
    }
}
