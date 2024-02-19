package spring;
public class Tyre
{
	private String brand;
	private int inch;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + ", inch=" + inch + "]";
	}

	

	
	
}
