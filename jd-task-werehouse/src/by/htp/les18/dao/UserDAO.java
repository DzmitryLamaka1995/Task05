package by.htp.les18.dao;

import by.htp.les18.bean.user.User;

public interface UserDAO {

	boolean logination(String login, String password) throws DAOException;
	boolean changeProfile(User user)throws DAOException;
	
}
