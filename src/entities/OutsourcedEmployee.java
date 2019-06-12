package entities;

public final class OutsourcedEmployee extends Employee {
	private Double additionalCharge;
		
	// Construct	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		setAdditionalCharge(additionalCharge);
	}
	
	// Getters and setters
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}	
	
	// Method
	public Double additionalCharge() {
		double aux = getAdditionalCharge();
		aux = (aux * 110) / 100;
		return aux;
	}
	
	@Override
	public final Double payment() {
		double aux = getHours() * getValuePerHour() + additionalCharge();
		return aux;
	} 
	

}
