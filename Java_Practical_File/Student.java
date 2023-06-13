class Student{  
    int id;  
    String name;  
    void display(){
        System.out.println("Student id: "+ id);
        System.out.println("Student name: "+name);
    }  
    public static void main(String args[]){  
    //creating objects  
    Student s1=new Student();    
    //displaying values of the object  
    s1.display();    
    }  
}  
