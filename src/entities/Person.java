package entities;

public abstract class Person {
	private String name;
	private Double income;

	// Constructor
	public Person(String name, Double income) {
		setName(name);
		setIncome(income);
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	// Methods
	public abstract Double calcTaxes();
	
	protected Double calcPercent(double value, double percent) {
		return (value * percent) / 100;
	}

	@Override
	public String toString() {
		return getName() + ": $ " + calcTaxes();
	}

}
