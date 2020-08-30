package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int cpf;
	private String nomeCompleto;

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	private List<Pessoa> pessoas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public void exibirNome() {
		this.nomeCompleto = this.nome + " " + this.sobrenome;
		System.out.println("Seu nome é: " + this.nomeCompleto);

	}

	public void Adicionar(Pessoa p2) {

		Pessoa p1 = new Pessoa();
		p1.setNome(p2.getNome());
		p1.setSobrenome(p2.getSobrenome());
		p1.setCpf(p2.getCpf());
		p1.setNomeCompleto(p2.getNome() + " " + p2.getSobrenome());
		pessoas.add(p1);

	}

	public void exibirObjto() {
		if (pessoas.size() == 0) {
			JOptionPane.showMessageDialog(null, "Nenhum usuário cadatrado!");
		} else {
			for (int i = 0; i < pessoas.size(); i++) {

				JOptionPane.showMessageDialog(null,
						"Nome: " + pessoas.get(i).getNome() + "\nSobrenome: " + pessoas.get(i).getSobrenome()
								+ "\nCpf: " + pessoas.get(i).getCpf() + "\nNome completo: "
								+ pessoas.get(i).getNomeCompleto());
			}
		}
	}

	public void consultar(String n1) {
		int aux = 0;
		if (pessoas.size() == 0) {
			JOptionPane.showMessageDialog(null, "Nenhum usuário cadatrado!");
		} else {
			for (int i = 0; i < pessoas.size(); i++) {
				if (n1.equals(pessoas.get(i).getNome())) {
					JOptionPane.showMessageDialog(null,
							"Nome: " + pessoas.get(i).getNome() + "\nSobrenome: " + pessoas.get(i).getSobrenome()
									+ "\nCpf: " + pessoas.get(i).getCpf() + "\nNome completo: "
									+ pessoas.get(i).getNomeCompleto());
					System.out.println("Nome: " + pessoas.get(i).getNome());
					System.out.println("Sobrenome: " + pessoas.get(i).getSobrenome());
					System.out.println("Cpf: " + pessoas.get(i).getCpf());
					System.out.println("Nome Completo: " + pessoas.get(i).getNomeCompleto());
					System.out.println("==============");
					aux = 1;
				}
			}
		}
		if (aux == 0) {
			System.out.println("Nome não encontrado");
			JOptionPane.showMessageDialog(null, "Usuário não encontrado");
		}
	}

	public void editar(int n1) {
		int aux = 0;
		
			
		if (pessoas.size() == 0) {
			JOptionPane.showMessageDialog(null, "Nenhum usuário cadatrado!");
		}
		 else {
			for (int i = 0; i < pessoas.size(); i++) {
				if (n1 == pessoas.get(i).getCpf()) {

					pessoas.get(i).setNome(JOptionPane.showInputDialog(null, "Digite o novo nome"));
					pessoas.get(i).setSobrenome(JOptionPane.showInputDialog(null, "Digite novo Sobrenome"));
					pessoas.get(i).setCpf(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novo Cpf")));
					pessoas.get(i).setNomeCompleto(pessoas.get(i).getNome() + " " + pessoas.get(i).getSobrenome());

					consultar(pessoas.get(i).getNome());

					JOptionPane.showMessageDialog(null, "Alterado com sucesso! ");
					aux = 1;
				}
			}
		}

		if (aux == 0) {
			JOptionPane.showMessageDialog(null, "Usuário não encontrado");
		}
		
	}

	public void excluir(int n1) {
		int aux = 0;
		if (pessoas.size() == 0) {
			JOptionPane.showMessageDialog(null, "Nenhum usuário cadatrado!");
		} else {
			for (int i = 0; i < pessoas.size(); i++) {
				if (n1 == pessoas.get(i).getCpf()) {
					aux = 1;

					String aux2 = JOptionPane.showInputDialog(null,
							"Usuário encontrado\nNome: " + pessoas.get(i).getNome() + "\nSobrenome: "
									+ pessoas.get(i).getSobrenome() + "\nCpf: " + pessoas.get(i).getCpf()
									+ "\nNome completo: " + pessoas.get(i).getNomeCompleto()
									+ "\n\nDeseja realmente excluir? S/N \n");
					if (aux2.equals("s") || aux2.equals("S")) {
						pessoas.remove(i);
						JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!");
					}else {
						JOptionPane.showMessageDialog(null, "Opção inválida");
					}
				}
			}
		}

		if (aux == 0) {
			JOptionPane.showMessageDialog(null, "Usuário não encontrado");
		}

	}
}
//
