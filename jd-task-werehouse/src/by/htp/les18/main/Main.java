package by.htp.les18.main;

import by.htp.les18.controller.ApplianceController;

public class Main {

	public static void main(String[] args) {
		ApplianceController applianceController = new ApplianceController();
		String request;
		String response;
		
		request = "findbycategory : Laptop ";
     
	response = 	applianceController.doAction(request);
		System.out.println(response);

	}

}
