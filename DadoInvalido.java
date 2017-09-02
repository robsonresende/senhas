public class DadoInvalido extends Exception {
	public DadoInvalido() {
		super("Dado inválido!");
	}

	public DadoInvalido(String msg) {
		super("Dado inválido!\n" + msg);
	}
}
