package by.htp.applianceForFood.bean;

public class Oven extends AppliaceForFood{
	
	private static final long serialVersionUID = -5541665886222848056L;
	private int capacity;
	private double depth;
	
    public Oven() {
    	
    }

	public Oven(int powerConsumption, double weight,int capacity, double depth, double height, double width) {
		super(powerConsumption, weight, height, width);
		this.capacity = capacity;
		this.depth = depth;
		
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + capacity;
		long temp;
		temp = Double.doubleToLongBits(depth);
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
		Oven other = (Oven) obj;
		if (capacity != other.capacity)
			return false;
		if (Double.doubleToLongBits(depth) != Double.doubleToLongBits(other.depth))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Oven [capacity=" + capacity + ", depth=" + depth + "]";
	}
	
    
    

}
