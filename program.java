package domainProgram;

public class program {
	
	protected String name;
	protected int Hours;
	protected double vHours;
	
	public program(String name, int Hours, double vHours) {
		this.name = name;
		this.Hours = Hours;
		this.vHours = vHours;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHours() {
		return Hours;
	}
	public void setHours(int hours) {
		Hours = hours;
	}
	public double getvHours() {
		return vHours;
	}
	public void setvHours(double vHours) {
		this.vHours = vHours;
	}
	
	public double payment() {
		return Hours * vHours;
	}
}
