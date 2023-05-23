public class Switch {
    public static void main(String args[]){
        char grade = 'A';
        switch(grade){ // switch(variable) { case }
            case 'A':
                System.out.println("You are a good student.");
                break;
            case 'B':
                System.out.println("You are an average student.");
                break;
            case 'C':
                System.out.println("You are a below average student.");
                break;
            default:
                System.out.println("Wrong Grade.");
        }   
    }    
}
