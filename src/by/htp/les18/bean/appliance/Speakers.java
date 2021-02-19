package by.htp.les18.bean.appliance;

public class Speakers extends OtherAppliance {
	
	private static final long serialVersionUID = -7242836185856309914L;
	private int numberOfSpeakers;
	private String frequensyRange;
	private double cordLength;
	
	public Speakers() {
		
	}

	public Speakers(String manufacturer,int powerConsumption,int numberOfSpeakers,String frequensyRange,double cordLength) {
		super(manufacturer,powerConsumption);
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequensyRange  = frequensyRange;
		this.cordLength = cordLength;
		
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFrequensyRange() {
		return frequensyRange;
	}

	public void setFrequensyRange(String frequensyRange) {
		this.frequensyRange = frequensyRange;
	}

	public double getCordLength() {
		return cordLength;
	}

	public void setCordLength(double cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(cordLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((frequensyRange == null) ? 0 : frequensyRange.hashCode());
		result = prime * result + numberOfSpeakers;
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
		Speakers other = (Speakers) obj;
		if (Double.doubleToLongBits(cordLength) != Double.doubleToLongBits(other.cordLength))
			return false;
		if (frequensyRange == null) {
			if (other.frequensyRange != null)
				return false;
		} else if (!frequensyRange.equals(other.frequensyRange))
			return false;
		if (numberOfSpeakers != other.numberOfSpeakers)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speakers [numberOfSpeakers=" + numberOfSpeakers + ", frequensyRange=" + frequensyRange + ", cordLength="
				+ cordLength + "]";
	}
	

}
