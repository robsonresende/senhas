import java.util.Random;

public class Base {
	private char num[] = {'0','1','2','3','4','5','6','7','8','9'};

	private char letra[] = {'A','B','C','D','E','F','G','H','I','J','K','L',
			'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	private char numLetra[] = {'0','1','2','3','4','5','6','7','8','9',
			'A','B','C','D','E','F','G','H','I','J','K','L',
			'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	public String sortNum(String digitos) throws DadoInvalido {
		Random ran = new Random();
		String str = "";
		int i = 0;
		try {
			i = Integer.parseInt(digitos);
		} catch (NumberFormatException nfe) {
			throw new DadoInvalido("O valor deve ser um número inteiro!");
		}

		if (i < 1 || i > 40)
			throw new DadoInvalido("A quantidade deve ser um número entre 1 e 40.");

		for (int x=0; x<i; x++) {
			str += num[ran.nextInt(10)];
		}
		return str;
	}

	public String sortLetra(String digitos) throws DadoInvalido {
		Random ran = new Random();
		String str = "";
		int i = 0;
		try {
			i = Integer.parseInt(digitos);
		} catch (NumberFormatException nfe) {
			throw new DadoInvalido("O valor deve ser um número inteiro!");
		}

		if (i < 1 || i > 40)
			throw new DadoInvalido("A quantidade deve ser um número entre 1 e 40.");

		for (int x=0; x<i; x++) {
			str += letra[ran.nextInt(26)];
		}
		return str;
	}

	public String sortNumLetra(String digitos) throws DadoInvalido {
		Random ran = new Random();
		String str = "";
		int i = 0;
		try {
			i = Integer.parseInt(digitos);
		} catch (NumberFormatException nfe) {
			throw new DadoInvalido("O valor deve ser um número inteiro!");
		}

		if (i < 1 || i > 40)
			throw new DadoInvalido("A quantidade deve ser um número entre 1 e 40.");

		for (int x=0; x<i; x++) {
			str += numLetra[ran.nextInt(36)];
		}
		return str;
	}

}
