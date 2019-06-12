package entities;

public class Employee {
	public String name;
	public Integer hours;
	public Double valuePerHour;

	// Construct
	public Employee(String name, Integer hours, Double valuePerHour) {
		setName(name);
		setHours(hours);
		setValuePerHour(valuePerHour);
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	// Methods
	public Double payment() {
		double aux = getHours() * getValuePerHour();
		return aux;
	}
	
	@Override
	public String toString() {
		return name + " - $ " + payment();
	}
	
}
