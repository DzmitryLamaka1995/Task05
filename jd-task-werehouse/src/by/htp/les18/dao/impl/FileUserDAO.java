package by.htp.les18.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import by.htp.les18.bean.user.User;
import by.htp.les18.dao.DAOException;
import by.htp.les18.dao.UserDAO;

public class FileUserDAO implements UserDAO {

	private static final File file = new File("resources/users.db");
	private BufferedReader br;
	private BufferedWriter bw;

	public FileUserDAO() {

	}

	@Override
	public boolean logination(String login, String password) throws DAOException {
		String str;
		String[] arr;
		try {
			br = new BufferedReader(new FileReader(file));

			while (br.ready()) {
				str = br.readLine();
				arr = str.split(" ");
				if (arr[2].equals(login)) {
					if (arr[3].equals(password)) {
						return true;
					} else {
						return false;
					}
				} else {
					return false;
				}
			}
			br.close();// ошибка кодирования. Аккуратно, close вызывается только в блоке finally и нигде еще
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		}

		return false;
	}

	@Override
	public boolean changeProfile(User user) throws DAOException {
		String str = user.getSurname() + " " + user.getName() + " " + user.getLogin() + " " + user.getPassword();
		try {
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(str);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			throw new DAOException(e);
		}
        return true;
	}

}
