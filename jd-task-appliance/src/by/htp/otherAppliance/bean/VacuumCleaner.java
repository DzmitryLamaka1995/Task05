package by.htp.otherAppliance.bean;



public class VacuumCleaner extends OtherAppliance {
	
	private static final long serialVersionUID = -8610388121033923882L;
	private char filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;
	
	public VacuumCleaner() {
		
	}

	public VacuumCleaner(int powerConsumption, char filterType, String bagType, String wandType, int motorSpeedRegulation,
			int cleaningWidth) {
		super(powerConsumption);
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	}

	public char getFilterType() {
		return filterType;
	}

	public void setFilterType(char filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + cleaningWidth;
		result = prime * result + filterType;
		result = prime * result + motorSpeedRegulation;
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth != other.cleaningWidth)
			return false;
		if (filterType != other.filterType)
			return false;
		if (motorSpeedRegulation != other.motorSpeedRegulation)
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VacuumCleaner [filterType=" + filterType + ", bagType=" + bagType + ", wandType=" + wandType
				+ ", motorSpeedRegulation=" + motorSpeedRegulation + ", cleaningWidth=" + cleaningWidth + "]";
	}
	
	
	
	

}
