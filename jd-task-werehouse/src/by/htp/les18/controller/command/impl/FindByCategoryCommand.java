package by.htp.les18.controller.command.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.les18.bean.appliance.Appliance;

import by.htp.les18.controller.command.Command;
import by.htp.les18.service.ServiceException;
import by.htp.les18.service.ServiceProvider;
import by.htp.les18.service.WarehouseService;

import by.htp.les18.view.ListApplianceView;

public class FindByCategoryCommand implements Command {

	// findbycategory : oven

	@Override
	public String execute(String request) {
		ServiceProvider provider = ServiceProvider.getInstance();
		WarehouseService warehouseService = provider.getWerehouseService();
		ListApplianceView listApplianceView = new ListApplianceView();

		List<Appliance> appliances = new ArrayList<Appliance>();
		List<String> searchByParameters = new ArrayList<String>();
		String[] data;
		String response = "";

		data = request.split("\\s+:\\s+")[1].split("\\s+");
		for (String string : data) {
			searchByParameters.add(string);
		}
		try {
			appliances = warehouseService.findByCategory(searchByParameters);
		} catch (ServiceException e) {
			response = "Error";
		}
		response = listApplianceView.ViewApplianceByList(appliances);

		return response;
	}

}
