/**
 * 
 */
package com.ps1.homedecor;

import java.util.Arrays;

/**
 * @author mukulc
 *
 */

public class Client {
	String reqKitchenDesign;
	String clientName;
	String[] reqDesingServices = new String[5];
	
	public Client(String reqKitchenDesign, String clientName, String[] reqDesingServices) {
		super();
		this.reqKitchenDesign = reqKitchenDesign;
		this.clientName = clientName;
		this.reqDesingServices = reqDesingServices;
	}

	public String getReqKitchenDesign() {
		return reqKitchenDesign;
	}

	public void setReqKitchenDesign(String reqKitchenDesign) {
		this.reqKitchenDesign = reqKitchenDesign;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String[] getReqDesingServices() {
		return reqDesingServices;
	}

	public void setReqDesingServices(String[] reqDesingServices) {
		this.reqDesingServices = reqDesingServices;
	}
	
	@Override
	public String toString() {
		return "Client [reqKitchenDesign=" + reqKitchenDesign + ", clientName=" + clientName + ", reqDesingServices="
				+ Arrays.toString(reqDesingServices) + "]";
	}

	public boolean validateClient() {
		
		return true;
	}
	
	public Integer identifyBasicPanCost() {
		if(reqKitchenDesign == "Modular")
			return 1500;
		if(reqKitchenDesign == "Italian")
			return 2500;
		if(reqKitchenDesign == "Rustic")
			return 1200;
		
		return 0;
	}
}
