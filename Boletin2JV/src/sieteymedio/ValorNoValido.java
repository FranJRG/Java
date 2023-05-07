package sieteymedio;

public class ValorNoValido extends Exception {

	public ValorNoValido() {
		super("Ese valor no es válido");
	}

	public ValorNoValido(String message) {
		super(message);

	}

	public ValorNoValido(Throwable cause) {
		super(cause);

	}

	public ValorNoValido(String message, Throwable cause) {
		super(message, cause);

	}

	public ValorNoValido(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
