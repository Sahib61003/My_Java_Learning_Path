public class Complex {
    private double real;
    private double imag;

    public Complex() {
        this.real = 0.5;
        this.imag = 1.0;
    } 
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex (Complex other) {
        this.real = other.real; 
        this.imag = other.imag;
    }
    public double getReal() { 
        return this.real;
    }
    public double getimag() { 
        return this.imag;
    }
    public void setReal (double real) {
        this.real = real;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
    public Complex add(Complex other) {
        double real = this.real + other.real;
        double imag = this.imag + other.imag;
        return new Complex (real, imag);
    }
    public Complex subtract (Complex other) { 
        double real = this.real - other.real; 
        double imag = this.imag - other.imag;
        return new Complex(real, imag);
    }
    public Complex multiply(Complex other) {
        double real = this.real * other.real - this.imag * other.imag;
        double imag = this.real * other.imag - this.imag * other.real;
        return new Complex(real, imag);
    }
    public Complex divide(Complex other) {
        double real = (this.real * other.real + this.imag * other.imag) / (other.real * other.real + other.imag * other.imag);
        double imag = (this.imag * other.real + this.real * other.imag) / (other.real * other.real + other.imag * other.imag);
       return new Complex(real, imag);
    }
    public static void main(String[] args) { 
        //Instantiate using default constructor 
        Complex c1 = new Complex(); 
        System.out.println(c1); 

        //Instantiate using constructor with arguments 
        Complex c2 = new Complex(3.0, 6.0); 
        System.out.println(c2); 

        //Instantiate using copy constructor 
        Complex c3 = new Complex(c2); 
        System.out.println(c3); 

        // perform arithmetic operations 
        Complex sum = c2.add(c3); 
        System.out.println(sum); 

        Complex diff = c2.subtract(c3); 
        System.out.println(diff); 

        Complex prod = c2.multiply(c3);
        System.out.println(prod); 

        Complex quot = c2.divide(c3);
        System.out.println(quot); 
        System.out.println("Sahib Preet Singh 00713211621 AI_ML");
     }
    
     @Override
     public String toString() {
         return this.real + " + " + this.imag + "i";
        
     } 
}


