package entities;

public class LegalPerson extends Person {
	private Integer numberEmployee;

	public LegalPerson(String name, Double income, Integer numberEmployee) {
		super(name, income);
		setNumberEmployee(numberEmployee);
	}

	public Integer getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(Integer numberEmployee) {
		this.numberEmployee = numberEmployee;
	}

	@Override
	public Double calcTaxes() {
		double taxe = 0;
		double percentage = 0;

		if (numberEmployee > 10) {
			percentage = 14;
		} else {
			percentage = 16;
		}

		taxe = super.calcPercent(super.getIncome(), percentage);
		return taxe;
	}

}
