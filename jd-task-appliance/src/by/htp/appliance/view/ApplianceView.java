package by.htp.appliance.view;


import by.htp.applianceForFood.bean.Oven;
import by.htp.applianceForFood.bean.Refrigerator;
import by.htp.applianceWithoutMains.bean.Laptop;
import by.htp.applianceWithoutMains.bean.TabletPC;
import by.htp.otherAppliance.bean.Speakers;
import by.htp.otherAppliance.bean.VacuumCleaner;

public class ApplianceView {
	public void print(Laptop laptop) {
		System.out.println("Battery capacity = " +laptop.getBatteryCapacity() + " | OS = " + laptop.getoS()+
				" | Memory ROM = " + laptop.getMemoryRom()+" | System memory = " + laptop.getSystemMemory()+
				" | CPU = "+ laptop.getcPU()+" | Display inches = " + laptop.getDisplayInches() );
	}
	public void print(TabletPC tabletPC) {
		System.out.println("Battery capacity = " + tabletPC.getBatteryCapacity()+" | Display inches =" + tabletPC.getDisplayInches()+
				" | Memory ROM = " + tabletPC.getMemoryRom()+" | Flash memory capacity =" + tabletPC.getFlashMemoryCapacity()+
				" | Color = " + tabletPC.getColor());
	}
	public void print(Oven oven) {
		System.out.println("Power consumption = "+ oven.getPowerConsumption() +" | Weight = " + oven.getWeight()+
				" | Capacity = "+ oven.getCapacity()+ " | Depth = " + oven.getDepth()+ " | Height = " + oven.getHeight()+
				" | Width = " + oven.getWidth());
	}
	public void print (Refrigerator refrigerator) {
		System.out.println("Power consumtion = " + refrigerator.getPowerConsumption()+" | Weight = " +refrigerator.getWeight()+  
				" | Freezer capacity = " + refrigerator.getFreezerCapacity()+ " | Overall capacity = " + refrigerator.getOverallCapacity()+
				" | Height = " + refrigerator.getHeight() + " | Width = " + refrigerator.getWidth());
		
	}
	public void print (VacuumCleaner vacuumCleaner) {
		System.out.println("Power consumtion = " + vacuumCleaner.getPowerConsumption()+" | Filter type = " + vacuumCleaner.getFilterType()+
				" | Bag type = " + vacuumCleaner.getBagType()+ " | Wand type = " + vacuumCleaner.getWandType()+
				" | Motor speed regulation = " + vacuumCleaner.getMotorSpeedRegulation() +" | Cleaning width = " + vacuumCleaner.getCleaningWidth());
	}
	public void print (Speakers speakers) {
		System.out.println("Power consumtion = " + speakers.getPowerConsumption()+ " | Number of speakers = " + speakers.getNumberOfSpeakers()+
				" | Frequency range = " + speakers.getFrequensyRange()+ " | Cord length = " + speakers.getCordLength());
	}

}
