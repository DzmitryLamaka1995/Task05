package by.htp.les18.view;

import java.util.List;

import by.htp.les18.bean.appliance.Appliance;
import by.htp.les18.bean.appliance.Laptop;
import by.htp.les18.bean.appliance.Oven;
import by.htp.les18.bean.appliance.Refrigerator;
import by.htp.les18.bean.appliance.Speakers;
import by.htp.les18.bean.appliance.TabletPC;
import by.htp.les18.bean.appliance.VacuumCleaner;

public class ListApplianceView {
	public String ViewApplianceByList(List<Appliance> appliances) {
		ApplianceView applianceView = new ApplianceView();
		String view = "";
		for (Appliance appliance : appliances) {

			if (appliance.getClass().getSimpleName().equalsIgnoreCase("Oven")) {
				view = view + applianceView.printAppliance((Oven) appliance) + "\n";
			} else if (appliance.getClass().getSimpleName().equalsIgnoreCase("Laptop")) {
				view = view + applianceView.printAppliance((Laptop) appliance) + "\n";
			} else if (appliance.getClass().getSimpleName().equalsIgnoreCase("Refrigerator")) {
				view = view + applianceView.printAppliance((Refrigerator) appliance) + "\n";
			} else if (appliance.getClass().getSimpleName().equalsIgnoreCase("VacuumCleaner")) {
				view = view + applianceView.printAppliance((VacuumCleaner) appliance) + "\n";
			} else if (appliance.getClass().getSimpleName().equalsIgnoreCase("TabletPC")) {
				view = view + applianceView.printAppliance((TabletPC) appliance) + "\n";
			} else if (appliance.getClass().getSimpleName().equalsIgnoreCase("Speakers")) {
				view = view + applianceView.printAppliance((Speakers) appliance) + "\n";
			}

		}
		return view;
	}
}
