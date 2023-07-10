import java.util.Scanner;
class prac11 {
    boolean check(String s1){ 
        Scanner input=new Scanner(System.in);
        System.out.println("Enter anthor string to check equality:");
        String s2=input.nextLine();
        return s1.equals(s2);
    }
    String revrse_str(String s){
        char ch[]=s.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--){  
            rev+=ch[i];  
        }  
        return rev;  
    }
    void change_case(String s){    
        System.out.println("Upper Case: "+s.toUpperCase());    
        System.out.println("Lower Case: "+s.toLowerCase());   
        
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=input.nextLine();
        prac11 S=new prac11();
        System.out.println("Are Strings Equal?: "+S.check(s));
        System.out.println("Reversed String is: "+S.revrse_str(s));
        S.change_case(s);


    }
}

