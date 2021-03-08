package by.htp.les18.bean.appliance;

public class ApplianceWithoutMains extends Appliance{
	
	private static final long serialVersionUID = -641566608452534333L;
	private double batteryCapacity;
	private int memoryRom;
	private double displayInches;
	
	public ApplianceWithoutMains() {
		
	}
	
	public ApplianceWithoutMains(String manufacturer,double batteryCapacity, int memoryRom, double displayInches) {
		super(manufacturer);
		this.batteryCapacity = batteryCapacity;
		this.memoryRom = memoryRom;
		this.displayInches = displayInches;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public double getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(double displayInches) {
		this.displayInches = displayInches;
	}

	@Override
	public String toString() {
		return "ApplianceWithoutMains [batteryCapacity=" + batteryCapacity + ", memoryRom=" + memoryRom
				+ ", displayInches=" + displayInches + "]";
	}

}
