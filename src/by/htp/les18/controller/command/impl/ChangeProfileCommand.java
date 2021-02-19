package by.htp.les18.controller.command.impl;

import by.htp.les18.bean.User;
import by.htp.les18.controller.command.Command;
import by.htp.les18.service.ClientService;
import by.htp.les18.service.ServiceException;
import by.htp.les18.service.ServiceProvider;

public class ChangeProfileCommand implements Command {

	@Override
	public String execute(String request) {

		// changeprofile : Surname=Ivanov Name=Ivan Login=user1995 password=06233;

		ServiceProvider provider = ServiceProvider.getInstance();
		ClientService clientService = provider.getClientService();

		String info;
		String surname;
		String name;
		String log;
		String pass;
		String response;

		info = request.split("\\s+:\\s+")[1];
		surname = info.split("\\s+")[0].split("=")[1];
		name = info.split("\\s+")[1].split("=")[1];
		log = info.split("\\s+")[2].split("=")[1];
		pass = info.split("\\s+")[3].split("=")[1];

		try {
			if (clientService.changeProfile(new User(surname, name, log, pass))) {
				response = "User has been successfully changed";
			} else {
				response = "User has not been changed";
			}
		} catch (ServiceException e) {
			response = "Error";
		}
		return response;
	}

}
