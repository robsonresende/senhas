import javax.swing.JOptionPane;

public class GeraSenha {
	public static void main(String[] args) {
				
		while(true) {
			String msg = "";
			Base base = new Base();
			int tipo = JOptionPane.showOptionDialog(null,"Tipo de senha",
				"Selecione",0,3,null,
				new String[]{"Numérica","Alfabética","Alfanumérica"},
				"Numérica");

			if (tipo == -1) System.exit(0);

			if (tipo == 0) {
				msg = "Informe a quantidade de dígitos desejada";
				msg = JOptionPane.showInputDialog(null,msg,"Números",1);
				try {
					JOptionPane.showMessageDialog(null,base.sortNum(msg));
				} catch (DadoInvalido di) {
					JOptionPane.showMessageDialog(null,di.getMessage(),"Erro",2);
				}
				
			}

			if (tipo == 1) {
				msg = "Informe a quantidade de dígitos desejada";
				msg = JOptionPane.showInputDialog(null,msg,"Números",1);
				try {
					JOptionPane.showMessageDialog(null,base.sortLetra(msg));
				} catch (DadoInvalido di) {
					JOptionPane.showMessageDialog(null,di.getMessage(),"Erro",2);
				}
			}

			if (tipo == 2) {
				msg = "Informe a quantidade de dígitos desejada";
				msg = JOptionPane.showInputDialog(null,msg,"Números",1);
				try {
					JOptionPane.showMessageDialog(null,base.sortNumLetra(msg));
				} catch (DadoInvalido di) {
					JOptionPane.showMessageDialog(null,di.getMessage(),"Erro",2);
				}
			}
		}
	}
}
