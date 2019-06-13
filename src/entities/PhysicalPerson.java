package entities;

public final class PhysicalPerson extends Person {
	private Double healthCoast;

	public PhysicalPerson(String name, Double income, Double healthCoast) {
		super(name, income);
		setHealthCoast(healthCoast);
	}

	public Double getHealthCoast() {
		return healthCoast;
	}

	public void setHealthCoast(Double healthCoast) {
		this.healthCoast = healthCoast;
	}

	@Override
	public final Double calcTaxes() {
		double taxe = 0;
		double percentage = 0;

		if (super.getIncome() < 20000.00) {
			percentage = 15;
		} else {
			percentage = 25;
		}

		taxe = super.calcPercent(super.getIncome(), percentage);

		if (getHealthCoast() > 0) {
			taxe -= super.calcPercent(getHealthCoast(), 50);
		}

		return taxe;
	}

}
