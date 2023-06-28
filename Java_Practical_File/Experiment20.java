public class Experiment20 {
public static void main(String[] args) {
try{
divideNumbers (10, 0); 
}catch (ArithmeticException e) {
System.out.println("ArithmeticException caught:" + e.getMessage());
}finally {
System.out.println ("Finally block executed");
}
try{
throwCustomException(); 
}catch (CustomException e){
System.out.println("customexception caught: " + e.getMessage());
}
}
public static void divideNumbers (int dividend, int divisor) throws ArithmeticException {
if (divisor == 0){
throw new ArithmeticException("Divisor cannot be zero");
}
int result = dividend / divisor;
System.out.println("Result:" + result);
}
public static void throwCustomException() throws CustomException {
throw new CustomException("Custom exception occurred");
}
static class CustomException extends Exception{
public CustomException(String message) {
super(message);
System.out.println("Sahib Preet Singh 00713211621 AI_ML");
}
}
}