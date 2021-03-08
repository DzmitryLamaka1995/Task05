package by.htp.les18.dao.find.appliance.impl;

import by.htp.les18.bean.appliance.Appliance;
import by.htp.les18.bean.appliance.Laptop;
import by.htp.les18.bean.appliance.Oven;
import by.htp.les18.bean.appliance.Refrigerator;
import by.htp.les18.bean.appliance.Speakers;
import by.htp.les18.bean.appliance.TabletPC;
import by.htp.les18.bean.appliance.VacuumCleaner;
import by.htp.les18.dao.find.appliance.ApplianceFactory;

public class ApplianceFactoryImpl implements ApplianceFactory {

	@Override
	public Appliance newApp(String name, String[] parameters) {
		if("Oven".equalsIgnoreCase(name)){
			return new Oven(parameters[0], Integer.parseInt(parameters[1]), Double.parseDouble(parameters[2]),
					Integer.parseInt(parameters[3]), Double.parseDouble(parameters[4]), Double.parseDouble(parameters[5]),
					Double.parseDouble(parameters[6]));
		}else if("Laptop".equalsIgnoreCase(name)) {
			return new Laptop(parameters[0], Double.parseDouble(parameters[1]), parameters[2], Integer.parseInt(parameters[3]),
					Integer.parseInt(parameters[4]), Double.parseDouble(parameters[5]), Double.parseDouble(parameters[6]));
		}else if("Refrigerator".equalsIgnoreCase(name)) {
			return new Refrigerator(parameters[0], Integer.parseInt(parameters[1]), Double.parseDouble(parameters[2]),
					Double.parseDouble(parameters[3]), Double.parseDouble(parameters[4]), Double.parseDouble(parameters[5]),
					Double.parseDouble(parameters[6]));
		}else if ("VacuumCleaner".equalsIgnoreCase(name)) {
			return new VacuumCleaner(parameters[0], Integer.parseInt(parameters[1]), parameters[2], parameters[3], parameters[4],
					Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
		}else if("TabletPC".equalsIgnoreCase(name)) {
			return new TabletPC(parameters[0], Double.parseDouble(parameters[1]), Double.parseDouble(parameters[2]),
					Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), parameters[5]);
		}else if("Speakers".equalsIgnoreCase(name)) {
			return new Speakers(parameters[0], Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), parameters[3],
					Double.parseDouble(parameters[4]));
		}else {
			return new Appliance();
		}
		
		
	}

}
