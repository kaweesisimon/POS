/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.pro;

/**
 *
 * @author USER
 */
public class Addition implements Strategy {
    @Override
	public float pay(float total, float paid, float f) {
            System.out.println("Balance : shs. " + (total-paid) );
		return 1;
	}
}
