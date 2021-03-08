package by.htp.les18.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.les18.bean.appliance.Appliance;
import by.htp.les18.dao.DAOException;
import by.htp.les18.dao.DAOProvider;
import by.htp.les18.dao.FindApplianceDAO;
import by.htp.les18.service.ServiceException;
import by.htp.les18.service.WarehouseService;

public class WarehouseServiceImpl implements WarehouseService {

	@Override
	public List<Appliance> findByCategory(List<String> parameters) throws ServiceException {
		List<Appliance> appliances = new ArrayList<Appliance>();
		DAOProvider provider = DAOProvider.getInstance();
		FindApplianceDAO findApplianceDAO = provider.getFindApplianceDAO();
		try {
			appliances = findApplianceDAO.findByCategory(parameters);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return appliances;
	}

}
