package by.htp.les18.dao.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.les18.bean.appliance.Appliance;
import by.htp.les18.dao.DAOException;
import by.htp.les18.dao.FindApplianceDAO;
import by.htp.les18.dao.find.appliance.impl.ApplianceFactoryImpl;
import by.htp.les18.dao.find.appliance.impl.ApplianceFilterImpl;
import by.htp.les18.dao.find.appliance.impl.ApplianceParserImpl;
import by.htp.les18.dao.find.appliance.impl.ApplianceSourceReaderImpl;

public class FileFindApplianceDAO implements FindApplianceDAO {
	private static final String PATH = "resources/appliances.db";

	public List<Appliance> findByCategory(List<String> parameters) throws DAOException {
		List<Appliance> appliances = new ArrayList<Appliance>();
		List<String> appliancesData = new ArrayList<String>();

		ApplianceFilterImpl applianceFilterImpl = new ApplianceFilterImpl(parameters);
		ApplianceParserImpl applianceParserImpl = new ApplianceParserImpl();
		ApplianceFactoryImpl applianceFactoryImpl = new ApplianceFactoryImpl();
		ApplianceSourceReaderImpl applianceSourceReaderImpl = null;
		try {
			applianceSourceReaderImpl = new ApplianceSourceReaderImpl(PATH, applianceFilterImpl);
			appliancesData = applianceSourceReaderImpl.readerByFilter();
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		} finally {
			try {
				applianceSourceReaderImpl.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		String name;
		String[] data;

		for (String string : appliancesData) {
			name = applianceParserImpl.parserByName(string);
			data = applianceParserImpl.parserParameters(string);
			
			appliances.add(applianceFactoryImpl.newApp(name, data));
		}

		return appliances;
	}

}
