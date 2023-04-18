/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.pro;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SingleObject {

   
   private static SingleObject instance = new SingleObject();

   
   private SingleObject(){}

   
   public static SingleObject getInstance(){
      return instance;
   }

   public void showMessage(){
       String Name;
                String Code;
                String Price;
                String Qty;
                String sid;
     System.out.println("This is the catalog");
     
     System.out.println("==================================");
       try {
            Statement s = db.mycon().createStatement();
             ResultSet rs = s.executeQuery(" SELECT * FROM product"); 
             
              while (rs.next()) {
                Name = rs.getString("Product_Name");
                Code = rs.getString("Bar_code");
                Price = rs.getString("Price");
                Qty = rs.getString("Qty");
                sid = rs.getString("Sid");
                
                System.out.println(Name+" cost shs:" + Price );
                   
            }
            
             
        } catch (SQLException e) {
            
            System.out.println(e);
        }       
   }
}


