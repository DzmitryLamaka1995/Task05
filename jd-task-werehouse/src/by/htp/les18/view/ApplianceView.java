package by.htp.les18.view;

import by.htp.les18.bean.appliance.Laptop;
import by.htp.les18.bean.appliance.Oven;
import by.htp.les18.bean.appliance.Refrigerator;
import by.htp.les18.bean.appliance.Speakers;
import by.htp.les18.bean.appliance.TabletPC;
import by.htp.les18.bean.appliance.VacuumCleaner;

public class ApplianceView {

	public String printAppliance(Oven oven) {
		return "Oven : Manufacturer >" + oven.getManufacturer() + "< | Power consumption >" + oven.getPowerConsumption()
				+ "< | Weight >" + oven.getWeight() + "< | Capacity >" + oven.getCapacity() + "< | Depth >"
				+ oven.getDepth() + "< | Height >" + oven.getHeight() + "< | Width >" + oven.getWidth() + "<";
	}

	public String printAppliance(Laptop laptop) {
		return "Laptop : Manufacturer >" + laptop.getManufacturer() + "< | Battery capacity >"
				+ laptop.getBatteryCapacity() + "< | OS >" + laptop.getoS() + "< | Memory ROM >" + laptop.getMemoryRom()
				+ "< | System memory >" + laptop.getSystemMemory() + "< | CPU >" + laptop.getcPU()
				+ "< | Display inches >" + laptop.getDisplayInches() + "<";
	}

	public String printAppliance(Refrigerator refrigerator) {
		return "Refrigerator : Manufacturer >" + refrigerator.getManufacturer() + "< | Power consumption >"
				+ refrigerator.getPowerConsumption() + "< | Weight >" + refrigerator.getWeight()
				+ "< | Freezer capacity >" + refrigerator.getFreezerCapacity() + "< | Overall capacity >"
				+ refrigerator.getOverallCapacity() + "< | Height >" + refrigerator.getHeight() + "< | Width >"
				+ refrigerator.getWidth() + "<";
	}

	public String printAppliance(VacuumCleaner vacuumCleaner) {
		return "VacuumCleaner : Manufacturer >" + vacuumCleaner.getManufacturer() + "< | Power consumption >"
				+ vacuumCleaner.getPowerConsumption() + "< | Filter type >" + vacuumCleaner.getFilterType()
				+ "< | Bag type >" + vacuumCleaner.getBagType() + "< | Wand type >" + vacuumCleaner.getWandType()
				+ "< | Motor speed regulation >" + vacuumCleaner.getMotorSpeedRegulation() + "< | Cleaning width >"
				+ vacuumCleaner.getCleaningWidth() + "<";

	}

	public String printAppliance(TabletPC tabletPC) {
		return "TabletPC : Manufacturer >" + tabletPC.getManufacturer() + "< | Battery capacity >"
				+ tabletPC.getBatteryCapacity() + "< | Display inches>" + tabletPC.getDisplayInches()
				+ "< | Memory ROM >" + tabletPC.getMemoryRom() + "< | Flash memory capacity >"
				+ tabletPC.getFlashMemoryCapacity() + "< | Color >" + tabletPC.getColor() + "<";
	}

	public String printAppliance(Speakers speakers) {
		return "Speakers : Manufacturer >" + speakers.getManufacturer() + "< | Power consumption >"
				+ speakers.getPowerConsumption() + "< | Number of speakers>" + speakers.getNumberOfSpeakers()
				+ "< | Frequency range >" + speakers.getFrequensyRange() + "< | Cord length >"
				+ speakers.getCordLength() + "<";
	}

}
