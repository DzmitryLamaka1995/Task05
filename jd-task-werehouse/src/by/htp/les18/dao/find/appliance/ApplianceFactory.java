package by.htp.les18.dao.find.appliance;


import by.htp.les18.bean.appliance.Appliance;

public interface ApplianceFactory {
	 Appliance newApp(String name, String[] parameters);
	 

}
