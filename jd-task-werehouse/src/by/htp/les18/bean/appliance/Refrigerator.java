package by.htp.les18.bean.appliance;

public class Refrigerator extends AppliaceForFood {
	
	private static final long serialVersionUID = -8512352045034792823L;
	private double freezerCapacity;
	private double overallCapacity;
	
	public Refrigerator() {
		
	}

	public Refrigerator(String manufacturer,int powerConsumption, double weight,double freezerCapacity,double overallCapacity, double height, double width) {
		super(manufacturer,powerConsumption, weight, height, width);
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		
	}

	public double getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(double freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public double getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(freezerCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(overallCapacity);
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
		Refrigerator other = (Refrigerator) obj;
		if (Double.doubleToLongBits(freezerCapacity) != Double.doubleToLongBits(other.freezerCapacity))
			return false;
		if (Double.doubleToLongBits(overallCapacity) != Double.doubleToLongBits(other.overallCapacity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator [freezerCapacity=" + freezerCapacity + ", overallCapacity=" + overallCapacity + "]";
	}

	

	
	
	
	


}
