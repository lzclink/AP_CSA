import java.util.*;
public class cokeMS{
    public static void main(String[] args){
        Scanner scan=new Scanner (System.in);
        int cash=0;
        for(;;){
            System.out.println("Have a Coke! Price: $1.25");
            while(cash<125){
                System.out.print("Insert coin:");
                double in=scan.nextDouble();
                int input=(int)in;
                if(input==5||input==10||input==25||input==100){
                    cash+=input;
                    System.out.println(" Amount entered: "+cash+" cents.");
                }    
                else{
                    System.out.println(" ** Rejecting "+input+" cent coin. ");
                }
            }
            System.out.println("Please make your selection: \n 1 - Coke \n 2 - Coke Zero \n 3 - Caffeine Free Diet Coke ");
            
            for(;;){
                System.out.print("Your choice: ");
                int c=scan.nextInt();
                if(c==1){
                    cash-=125;
                    System.out.println(" Dispensing Coke");
                    while(cash>0){
                        if(cash>=25){
                            cash-=25;
                            System.out.println(" Returning quarter.");
                            continue;
                        }
                        if(cash>=10){
                            cash-=10;
                            System.out.println(" Returning dime.");
                            continue;
                        }
                        if(cash>=5){
                            cash-=5;
                            System.out.println(" Returning nickel.");
                            continue;
                        }
                    }
                    break;
                }
                if(c==2){
                    cash-=125;
                    System.out.println(" Dispensing Coke Zero");
                    while(cash>0){
                        if(cash>=25){
                            cash-=25;
                            System.out.println(" Returning quarter.");
                        }
                        else if(cash>=10){
                            cash-=10;
                            System.out.println(" Returning dime.");
                        }
                        else if(cash>=5){
                            cash-=5;
                            System.out.println(" Returning nickel.");
                        }
                    }
 
                    break;
                }    
                if(c==3){
                    cash-=125;
                    System.out.println(" Dispensing Caffeine Free Diet Coke ");
                    while(cash>0){
                        if(cash>=25){
                            cash-=25;
                            System.out.println(" Returning quarter.");
                            continue;
                        }
                        if(cash>=10){
                            cash-=10;
                            System.out.println(" Returning dime.");
                            continue;
                        }
                        if(cash>=5){
                            cash-=5;
                            System.out.println(" Returning nickel.");
                            continue;
                        }
                    }
                    break;
                }
                else{
                    System.out.println(" ** No such beverage. Choose another. ");
                    continue;
                }
            }
        }
    }
}