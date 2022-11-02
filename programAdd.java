package domainProgram;

public class programAdd extends program {
	
	protected double addCharge;
	
	public programAdd(String name, int Hours, double vHours, double addCharge) {
		super(name, Hours, vHours);
		this.addCharge = addCharge;
	}

	public double getAddCharge() {
		return addCharge;
	}

	public void setAddCharge(double addCharge) {
		this.addCharge = addCharge;
	}
	
	@Override
	public double payment() {
		return super.payment()+addCharge *1.1;
	}
	
}
