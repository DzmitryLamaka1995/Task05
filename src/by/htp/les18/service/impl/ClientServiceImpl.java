package by.htp.les18.service.impl;

import by.htp.les18.bean.User;
import by.htp.les18.dao.DAOException;
import by.htp.les18.dao.DAOProvider;
import by.htp.les18.dao.UserDAO;

import by.htp.les18.service.ClientService;
import by.htp.les18.service.ServiceException;

public class ClientServiceImpl implements ClientService {

	@Override
	public boolean logination(String login, String password) throws ServiceException {
		// validation
		if (login == null || "".equals(login)) {
			return false;
		}

		DAOProvider provider = DAOProvider.getInstance();
		UserDAO userDAO = provider.getUserDAO();

		boolean result;
		try {
			result = userDAO.logination(login, password);
		} catch (DAOException e) {

			throw new ServiceException(e);
		}

		return result;
	}

	@Override
	public boolean changeProfile(User user) throws ServiceException {
		boolean result = false;
		if (user.getLogin() == null || "".equals(user.getLogin())) {
			return result;
		} else if (user.getPassword() == null || "".equals(user.getPassword())) {
			return result;
		} else if (user.getSurname() == null || "".equals(user.getSurname())) {
			return result;
		} else if (user.getName() == null || "".equals(user.getName())) {
			return result;
		} else {
			DAOProvider provider = DAOProvider.getInstance();
			UserDAO userDAO = provider.getUserDAO();
			try {
				result = userDAO.changeProfile(user);
			} catch (DAOException e) {

				throw new ServiceException(e);
			}
			return result;
		}
	}

}
