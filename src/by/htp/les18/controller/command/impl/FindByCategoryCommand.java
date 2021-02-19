package by.htp.les18.controller.command.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.les18.bean.Appliance;
import by.htp.les18.controller.command.Command;
import by.htp.les18.service.ServiceException;
import by.htp.les18.service.ServiceProvider;
import by.htp.les18.service.WarehouseService;

public class FindByCategoryCommand implements Command {

	// findbycategory : oven

	@Override
	public String execute(String request) {
		ServiceProvider provider = ServiceProvider.getInstance();
		WarehouseService warehouseService = provider.getWerehouseService();

		List<Appliance> result = new ArrayList<Appliance>();
		String info;
		String response = "";

		info = request.split("\\s+:\\s+")[1];
		try {
			result = warehouseService.findByCategory(info);
		} catch (ServiceException e) {
			response = "Error";
		}

		for (Appliance appliance : result) {
			response = response + appliance.toString() + "\n";
		}

		return response;
	}

}
