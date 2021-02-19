package by.htp.applianceWithoutMains.bean;

import java.io.Serializable;

public class ApplianceWithoutMains implements Serializable {
	
	private static final long serialVersionUID = -3259429127334446752L;
	private double batteryCapacity;
	private int memoryRom;
	private double displayInches;
	
	public ApplianceWithoutMains() {
		
	}
	
	public ApplianceWithoutMains(double batteryCapacity, int memoryRom, double displayInches) {
		super();
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(displayInches);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + memoryRom;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplianceWithoutMains other = (ApplianceWithoutMains) obj;
		if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
			return false;
		if (Double.doubleToLongBits(displayInches) != Double.doubleToLongBits(other.displayInches))
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ApplianceWithoutMains [batteryCapacity=" + batteryCapacity + ", memoryRom=" + memoryRom
				+ ", displayInches=" + displayInches + "]";
	}

}
