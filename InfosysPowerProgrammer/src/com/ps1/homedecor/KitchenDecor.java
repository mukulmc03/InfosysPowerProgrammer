/**
 * 
 */
package com.ps1.homedecor;

/**
 * @author mukulc
 *
 */
public class KitchenDecor extends InteriorDecor{
	private String[] kitchenDecorServicesArr = {"Flooring", "Lighting", "Cabinet"};
	private int[] decorServicesCostArr = {450, 200, 2000};
	private int kitchenSize;
	private int numOfDays;

	public KitchenDecor(Client client, int kitchenSize, int numOfDays) {
		super(client);
		// TODO Auto-generated constructor stub
		this.kitchenSize=kitchenSize;
		this.numOfDays=numOfDays;
	}



	@Override
	public String toString() {
		return "KitchenDecor [Client= " + this.getClient() + "kitchenSize=" + kitchenSize + ", numOfDays=" + numOfDays + "]";
	}

	public int identifyServicesCost() {
		int decorServicesCost=0;

		for(String reqService : this.getClient().getReqDesingServices()) {
			for(int i = 0; i < decorServicesCostArr.length; i ++) {
				if(reqService.equals(kitchenDecorServicesArr[i])) {
					//System.out.println(reqService +": "+kitchenDecorServicesArr[i]);
					decorServicesCost = decorServicesCostArr[i] + decorServicesCost;	 
				}
			}
		}
		return (decorServicesCost == 0 ? -1 : decorServicesCost);
	}

	@Override
	public void calculateTotalDecorCost() {
		// TODO Auto-generated method stub
		generateDecorId(this.getClient());
		int decorServicesCost = identifyServicesCost();
		//boolean validateClient = this.getClient().validateClient();

		if(decorServicesCost > 0 && this.getClient().validateClient() && numOfDays > 0) {
			int basicPlanCost = this.getClient().identifyBasicPanCost();

			if(decorServicesCost > 0) {
				for(String reqService : this.getClient().getReqDesingServices()) {
					if(reqService.equals("Flooring")) {
						decorServicesCost = decorServicesCost - decorServicesCostArr[0];
						decorServicesCost = decorServicesCost + (decorServicesCostArr[0] * kitchenSize);
						setBlueprintCost(75*kitchenSize);
					}
					else {
						setBlueprintCost(2500);
						
					}
				}
			}
		}
	}




}
