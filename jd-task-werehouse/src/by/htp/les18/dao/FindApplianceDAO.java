package by.htp.les18.dao;

import java.util.List;

import by.htp.les18.bean.appliance.Appliance;

public interface FindApplianceDAO {

	List<Appliance> findByCategory(List<String> parameters) throws DAOException;
}
