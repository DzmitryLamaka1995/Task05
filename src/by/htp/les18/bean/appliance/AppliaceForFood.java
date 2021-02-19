package by.htp.les18.bean.appliance;

import by.htp.les18.bean.Appliance;

public class AppliaceForFood extends Appliance {
	
private static final long serialVersionUID = -539389331303634980L;
	private int powerConsumption;
	private double weight;
	private double height;
	private double width;
	
	public AppliaceForFood() {
		
	}

	public AppliaceForFood(String manufacturer,int powerConsumption, double weight, double height, double width) {
		super(manufacturer);
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + powerConsumption;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		AppliaceForFood other = (AppliaceForFood) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AppliaceForFood [powerConsumption=" + powerConsumption + ", weight=" + weight + ", height=" + height
				+ ", width=" + width + "]";
	}
	
	

	

	

	
	
	
	
	
	

}
