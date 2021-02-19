package by.htp.les18.bean.appliance;

import by.htp.les18.bean.Appliance;

public class OtherAppliance extends Appliance{
	
	private static final long serialVersionUID = 3690247498104347518L;
	private int powerConsumption;

	public OtherAppliance() {

	}

	public OtherAppliance(String manufacturer, int powerConsumption) {
		super(manufacturer);
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
		int result = super.hashCode();
		result = prime * result + powerConsumption;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
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
