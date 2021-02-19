package by.htp.otherAppliance.bean;

import java.io.Serializable;

public class OtherAppliance implements Serializable {

	private static final long serialVersionUID = 8255165639813499765L;
	private int powerConsumption;

	public OtherAppliance() {

	}

	public OtherAppliance(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + powerConsumption;
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
		OtherAppliance other = (OtherAppliance) obj;
		if (powerConsumption != other.powerConsumption)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OtherAppliance [powerConsumption=" + powerConsumption + "]";
	}

}
