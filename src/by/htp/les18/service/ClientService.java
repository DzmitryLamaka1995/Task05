package by.htp.les18.service;

import by.htp.les18.bean.User;

public interface ClientService {
	
	boolean logination(String login, String password) throws ServiceException;
	boolean changeProfile(User user) throws ServiceException;
	
}
