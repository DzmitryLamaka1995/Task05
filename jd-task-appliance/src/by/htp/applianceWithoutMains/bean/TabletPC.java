package by.htp.applianceWithoutMains.bean;

public class TabletPC extends ApplianceWithoutMains{
	
	private static final long serialVersionUID = -1499903900706409751L;
	private int flashMemoryCapacity;
	private String color;
	
	public TabletPC() {
		
	}

	public TabletPC(double batteryCapacity, double displayInches, int memoryRom, int flashMemoryCapacity,
			String color) {
		super(batteryCapacity, memoryRom, displayInches);
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
		
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + flashMemoryCapacity;
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
		TabletPC other = (TabletPC) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (flashMemoryCapacity != other.flashMemoryCapacity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TabletPC [flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}
	
	
	
	

}
