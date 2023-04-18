/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.pro;

/**
 *
 * @author USER
 */
    
    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Demo {
	private static float bill;
	public static void main(String[] args) throws IOException{
            Scanner scanner = new Scanner(System.in);
             System.out.println("Type 'Card' or 'cash'to proceed with payment ");
            String pay = scanner.next();
            
            
            switch(pay){case "cash" : 
                System.out.println("Paying with cash");
                System.out.print("Enter amount paid : ");
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               float value1=Float.parseFloat(br.readLine());
                System.out.print("Enter the total amount: ");
		  float value2=Float.parseFloat(br.readLine());
                  
             
               Context context = new Context(new Addition());
                                  
	      System.out.println("Addition = " + context.executeStrategy(value1, value2, bill));
System.out.print("payment successful ");
                
            break;
            case "card" : 
                BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter card number: ");
                 String number = b.readLine();
                 System.out.print("Enter amount paid: ");
               float valu1=Float.parseFloat(b.readLine());
                 System.out.println("Paying in progress with crad no. " + number);
                 
             
                Context context2 = new Context(new Subtraction());		
                {
                    float valu2 = 0;
                    System.out.println("Subtraction = " + context2.executeStrategy(valu1, valu2,bill));
                }
                System.out.println("payment successful ");
                
            break;

            
            default : System.out.println("Enter correct name");
            } 
	   }
        private javax.swing.JLabel bill_tot;
       // String bill = bill_tot.getText();
        //float f =Float.parseFloat(bill);

    public Demo() {
       String x = bill_tot.getText();
       float f =Float.parseFloat(x);
        this.bill = f;
    }

}

