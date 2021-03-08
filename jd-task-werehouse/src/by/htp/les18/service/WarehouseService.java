package by.htp.les18.service;

import java.util.List;

import by.htp.les18.bean.appliance.Appliance;

public interface WarehouseService {
	
	List<Appliance> findByCategory(List<String> parameters) throws ServiceException;

}
