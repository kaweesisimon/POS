/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.pro;

/**
 *
 * @author USER
 */

public class Context {

	   private Strategy strategy;
	 
	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public float executeStrategy(float total, float paid,float f){
	      return strategy.pay(total, paid, f);
	   }
            
}

