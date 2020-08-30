package view;

import javax.swing.JOptionPane;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();

		int opc = 0;
		int aux2;
		do {
			try {
				opc = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Digite Uma op��o:\n1)Adicionar.\n2)Buscar usu�rio.\n3)Exibir Todos."
								+ "\n4)Editar\n5)Excluir.\n6)Sair.\n "));

				switch (opc) {
				case 1:
					// adicionar

					p1.setNome(JOptionPane.showInputDialog(null, "Digite seu nome:"));
					p1.setSobrenome(JOptionPane.showInputDialog(null, "Digite seu sobrenome:"));
					p1.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o cpf: ")));
					p1.Adicionar(p1);

					break;

				case 2:

					// Buscar usu�rio
					if (p1.getPessoas().size() == 0) {
						JOptionPane.showMessageDialog(null, "Nenhum usu�rio cadatrado!");
					} else {
						String aux = JOptionPane.showInputDialog(null, "Digite o nome para buscar usu�rio ");
						p1.consultar(aux);
					}
					break;

				case 3:

					// Exibir todos
					p1.exibirObjto();

					break;

				case 4:
					try {
				
					// Editar
				
					if (p1.getPessoas().size() == 0) {
						JOptionPane.showMessageDialog(null, "Nenhum usu�rio cadatrado!");
					} else {

						aux2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o cpf que voc� deseja editar "));
						p1.editar(aux2);
			       } 
			
		}catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Cpf inv�lido");
		
					
						
			
						
					}
					
						
					
					break;

				case 5:

					// excluir
					if (p1.getPessoas().size() == 0) {
						JOptionPane.showMessageDialog(null, "Nenhum usu�rio cadatrado!");
					} else {
						aux2 = Integer
								.parseInt(JOptionPane.showInputDialog(null, "Digite o cpf que voc� deseja excluir "));
						p1.excluir(aux2);
					}
					break;

				case 6:

					// sair
					JOptionPane.showMessageDialog(null, "Volte sempre");
					break;
				}

			} catch (Exception e) {
				String erro = e.getMessage();
				if (erro == "null") {
					JOptionPane.showMessageDialog(null, "Saindo...");
					opc = 6;
				}
				if (erro.equals("For input string: \"\"")) {
					JOptionPane.showMessageDialog(null, "Op��o inv�lida");
				}
				System.out.println(erro);

			}

		} while (opc != 6);

	}

}
