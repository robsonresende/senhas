/**
Este aplicativo gera uma senha alfanumérica com uma quantidade de dígitos a escolha do usuário.
*/
import javax.swing.JOptionPane;
import java.util.Random;

public class GeraSenha {
	public static void main(String[] args) {
		Random ran = new Random();
		char carac[] = {'0','1','2','3','4','5','6','7','8','9',
			'A','B','C','D','E','F','G','H','I','J','K','L',
			'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int nr_carac = 0;
		String senha = "", str = "";

		while(nr_carac <= 0) {		
			str = "Para gerar uma senha alfanumérica você \ndeve informar a quantidade de caracteres."; 
			str = JOptionPane.showInputDialog(null,str,"Mensagem",1);
			if (str == null) System.exit(0);
			
			nr_carac = Integer.parseInt(str);
		}
		
		for (int i=nr_carac; i>=1; i--) {
			senha += carac[ran.nextInt(36)];
		}

		str = "Senha: " + senha;
		JOptionPane.showMessageDialog(null,str,"Mensagem",1);
		System.exit(0);
	}
}
