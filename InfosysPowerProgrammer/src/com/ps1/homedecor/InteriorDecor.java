/**
 * 
 */
package com.ps1.homedecor;

/**
 * @author mukulc
 *
 */
public abstract class InteriorDecor {
	private static int counter = 0;
	private static Client client = new Client();
	private static String decorId;
	private double totalDecorCost;
	private int blueprintCost;
	
	public InteriorDecor() {
		// TODO Auto-generated constructor stub
	}

	public InteriorDecor(Client client) {
		super();
		this.client = client;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		InteriorDecor.counter = counter;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getDecorID() {
		return decorId;
	}

	public void setDecorID(String decorID) {
		this.decorId = decorID;
	}

	public double getTotalDecorCost() {
		return totalDecorCost;
	}

	public void setTotalDecorCost(double totalDecorCost) {
		this.totalDecorCost = totalDecorCost;
	}

	public int getBlueprintCost() {
		return blueprintCost;
	}

	public void setBlueprintCost(int blueprintCost) {
		this.blueprintCost = blueprintCost;
	}
	
	public static void generateDecorId(Client client) {
		counter ++;
		String reqKitchenDesign = client.getReqKitchenDesign();
		if(reqKitchenDesign == "Rustic")
			decorId="RU100" + counter;
		if(reqKitchenDesign == "Modular")
			decorId="MO100" + counter;
		if(reqKitchenDesign == "Italian")
			decorId="IT100" + counter;
		
		System.out.println("Decor ID: " + decorId);
	}
	
	public abstract void calculateTotalDecorCost();
}
