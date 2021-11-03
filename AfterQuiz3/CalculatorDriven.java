public class CalculatorDriven {
    // In this class we will not have any main method...main method will reside in 
    // our driver class
    
    // create instance variables (apply and can be used in the whole class)
    private int num1;
    private int num2; // private means accessible only within this class, not outside
    
    // constructor
    // 1) to intialize the instance variables of the class
    // 2) name of the constructor is the same as the name of the class
    // 3) constructor must not have any return type, not even void
    public CalculatorDriven (int a){
        num1 = a; // intialize num1 with a
        num2 = a; // intialize num2 with b
    }
    
    // methods
    public int add(){
        return num1 + num2;
    }
    public int diff(){
        return num1 - num2;
    }
    public int product(){
        return num1 * num2;
    }
    public double div(){
        return num1 / (double)num2;
    }
    public int rem(){
        return num1 % num2;
    }
    static public int ercifang=2;
    public int pingfang(){
        int x=num1;
        for(int i=1;i<ercifang;i++){
            x*=x;
        }
        return x;
    }
        
}