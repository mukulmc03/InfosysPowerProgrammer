/**
 * 
 */
package com.ps1.homedecor;

/**
 * @author mukulc
 *
 */
public class TestHomeDecor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] reqDesignServices = {};
		Client c = new Client("Modular", "Mukul", reqDesignServices);
		Client c2 = new Client("Modular", "Rahul", reqDesignServices);
		
		KitchenDecor kd = new KitchenDecor(c, 10, 10);
		System.out.println(kd.identifyServicesCost());
		
		
		

	}

}
