package by.htp.les18.controller.command.impl;

import by.htp.les18.controller.command.Command;
import by.htp.les18.service.ClientService;
import by.htp.les18.service.ServiceException;
import by.htp.les18.service.ServiceProvider;

public class LoginationCommand implements Command {

	//// "logination : login=aa password=ss"

	@Override
	public String execute(String request) {
		ServiceProvider provider = ServiceProvider.getInstance();
		ClientService clientService = provider.getClientService();

		String info;
		String log;
		String pass;
		String response;

		info = request.split("\\s+:\\s+")[1];
		log = info.split("\\s+")[0].split("=")[1];
		pass = info.split("\\s+")[1].split("=")[1];

		try {
			if (clientService.logination(log, pass)) {
				response = "Validation was successful";
			} else {
				response = "Validation failed";
			}
		} catch (ServiceException e) {
			response = "Error";
		}
		return response;

	}

}
