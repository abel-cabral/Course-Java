package model.exceptions;

// Extendendo Exception o compilador obriga a tratar a excessao
public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;

	// Permite que ao instanciar a classe devemos passar uma mensagem para a mesma
	public DomainException(String message) {
		super(message);
	}

}
