package by.htp.les18.bean.appliance;

public class Laptop extends ApplianceWithoutMains {
	
	private static final long serialVersionUID = -2802728324822442687L;
	private String oS;
	private int systemMemory;
	private double cPU;
	
	public Laptop() {
		
	}

	public Laptop(String manufacturer, double batteryCapacity, String oS, int memoryRom,int systemMemory,
			 double cPU, double displayInches ) {
		super(manufacturer,batteryCapacity, memoryRom, displayInches);
		this.oS = oS;
		this.systemMemory = systemMemory;
		this.cPU = cPU;
		
	}

	public String getoS() {
		return oS;
	}

	public void setoS(String oS) {
		this.oS = oS;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getcPU() {
		return cPU;
	}

	public void setcPU(double cPU) {
		this.cPU = cPU;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(cPU);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((oS == null) ? 0 : oS.hashCode());
		result = prime * result + systemMemory;
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
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(cPU) != Double.doubleToLongBits(other.cPU))
			return false;
		if (oS == null) {
			if (other.oS != null)
				return false;
		} else if (!oS.equals(other.oS))
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [oS=" + oS + ", systemMemory=" + systemMemory + ", cPU=" + cPU + "]";
	}


	

	
	
	
	

}
