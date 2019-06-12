package entities;

public final class ImportedProduct extends Product {
	private Double customFee;

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		setCustomFee(customFee);
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}

	public Double totalPrice() {
		double aux = super.getPrice() + getCustomFee();
		return aux;
	}
	
	@Override
	public final String priceTag() {
		return super.getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", getCustomFee()) + ")";
	}
	

}
