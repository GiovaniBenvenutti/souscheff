package br.com.SousCheff.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

import br.com.SousCheff.Model.CadastraReceita;
import br.com.SousCheff.Model.GravaReceita;
import br.com.SousCheff.Model.LeReceita;
import br.com.SousCheff.Model.Leitura;

public class MenuMain {
	private static Leitura l = new Leitura();
	private static List<Receita> lista = new ArrayList<Receita>();

	public static void main(String[] args) {

		Integer opcao = 0;
		LeReceita lr = new LeReceita();
		lista = lr.LeArquivoObj();

		while (opcao != 4) {
			System.out.println("\n");
			System.out.println("\t ==============================");
			System.out.println("\t MENU DE RECEITAS PARA A SEMANA");
			System.out.println("\t ==============================");
			System.out.println("\t      O que deseja fazer?");
			System.out.println("\t 1.........Incluir nova receita");
			System.out.println("\t 2......ver a lista de receitas");
			System.out.println("\t 3...............editar receita");
			System.out.println("\t 4.............sair do programa");
			System.out.println("\t ==============================");
			System.out.println("\n");

			opcao = Integer.parseInt(l.EntDados("\t Escolha uma opcao"));

			switch (opcao) {
			case 1:
				incluir();
				break;
			case 2:
				imprime();
				break;
			case 3:
				editar();
				break;
			case 4:
				sair();
				break;
			default:
				System.out.println("\n\t ======================");
				System.out.println("\n\t    entrada invalida");
				System.out.println("\n\t ======================");
			}
		}
	}

	public static void incluir() {

		try {
			lista.add(CadastraReceita.incluiReceita());
			GravaReceita gr = new GravaReceita();
			gr.GravaArquivoObj(lista);
			System.out.println("\nReceita Inserida com sucesso");
		} catch (Exception e) {
			System.out.println("\nErro ao incluir receita!");
			System.out.println(e);
		}
	}

	public static void imprime() {
		if (lista.isEmpty() == true) {
			System.out.println("\n\t =====================");
			System.out.println("\n\t a lista esta vazia!");
			System.out.println("\n\t =====================");
		} else {
			for (Receita receita : lista) {
				System.out.println("--------");
				System.out.println(receita);
				System.out.println("--------");
			}
		}

	}

	public static void editar() {

		Leitura le = new Leitura();

		if (lista.isEmpty() == true) {
			System.out.println("\n\t ===============================");
			System.out.println("\n\t A lista de receitas está vazia!");
			System.out.println("\n\t ===============================");
		} else {
			String nome = le.EntDados("Qual o nome da receita que voce deseja editar? \n");

			for (Receita receita : lista) {
				if (nome.equals(receita.getNome())) {
					System.out.println(receita);

					int opcao = 0;
					while (opcao != 6) {
						System.out.println("\t O que voce gostaria de fazer com essa receita?\n");
						System.out.println("\t 1..............editar nome");
						System.out.println("\t 2..........editar refeição");
						System.out.println("\t 3......editar ingredientes");
						System.out.println("\t 4...editar modo de preparo");
						System.out.println("\t 5..................EXCLUIR");
						System.out.println("\t 6...................voltar");
						System.out.println("\n");

						opcao = Integer.parseInt(l.EntDados("\t Escolha uma opcao"));

						switch (opcao) {
						case 1:
							editaNome(lista, receita);
							break;
						case 2:
							editaRefeição(lista, receita);
							break;
						case 3:
							editaIngredientes(lista, receita);
							break;
						case 4:
							editarModoDePreparo(lista, receita);
							break;
						case 5:
							excluir(lista, receita);
							break;
						case 6:
							return;
						default:
							System.out.println("\n\t ======================");
							System.out.println("\n\t    entrada invalida");
							System.out.println("\n\t ======================");
						}

					}
				}
			}
			for (Receita receita : lista) {
				if (!nome.equals(receita.getNome())) {
					System.out.println("Receita não econtrada");
					return;
				}
			}
		}
	}

	public static void editaNome(List<Receita> lista, Receita receita) {
		List<Receita> lista2 = lista;
		Receita receita2 = new Receita();
		for (Receita r : lista2) {
			if (receita.equals(r)) {
				receita2 = receita;
			}
		}
		receita2.setNome(l.EntDados("\t Insira um novo nome para esta reeita."));
		regravaLista(lista2);
		System.out.println("\n Nome editado com sucesso");
	}

	public static void editaRefeição(List<Receita> lista, Receita receita) {
		List<Receita> lista2 = lista;
		Receita receita2 = new Receita();
		for (Receita r : lista2) {
			if (receita.equals(r)) {
				receita2 = receita;
			}
		}
		receita2.setRefeição(CadastraReceita.montaRefeição());
		regravaLista(lista2);
		System.out.println("\n REfeição editada com sucesso");
	}

	public static void editaIngredientes(List<Receita> lista, Receita receita) {
		List<Receita> lista2 = lista;
		Receita receita2 = new Receita();
		for (Receita r : lista2) {
			if (receita.equals(r)) {
				receita2 = receita;
			}
		}
		receita2.setIngredientes(l.EntDados("\t Insira os novos ingredientes."));
		regravaLista(lista2);
		System.out.println("\n Ingredientes editados com sucesso");
	}

	public static void editarModoDePreparo(List<Receita> lista, Receita receita) {
		List<Receita> lista2 = lista;
		Receita receita2 = new Receita();
		for (Receita r : lista2) {
			if (receita.equals(r)) {
				receita2 = receita;
			}
		}
		receita2.setModoDePreparo(l.EntDados("\t Insira o novo modo de preparo."));
		regravaLista(lista2);
		System.out.println("\n Modo de preparo editado com sucesso");
	}

	public static void excluir(List<Receita> lista, Receita receita) {
		List<Receita> lista2 = lista;
		Receita receita2 = new Receita();
		for (Receita r : lista2) {
			if (receita.equals(r)) {
				receita2 = receita;
			}
		}
		lista2.remove(receita2);
		regravaLista(lista2);
		System.out.println("\nReceita excluida com sucesso");
	}

	public static void regravaLista(List<Receita> novaLista) {
		GravaReceita gra = new GravaReceita();
		try {
			gra.GravaArquivoObj(novaLista);
		} catch (IOException e) {
			e.printStackTrace();
		}
		MenuMain.lista = novaLista;
	}

	public static void sair() {
		System.out.println("\t      Bom Apetite ! ");
		System.out.println("\t ======================");
	}

//	=================================================================================================================

	public static Receita pesquisaPorNome(List<Receita> lista, String nome) {
		Receita re = new Receita(" ", " ", " ", " ");

		String nome2 = nome;
		for (Receita rec : lista) {
			if (nome2.equals(rec.getNome()))
				re = rec;
		}
		return re;
	}

	public static void editar(List<Receita> lista, Receita r) {

		excluir(lista, r.getNome());
		incluir(lista, r);

		JOptionPane.showMessageDialog(null, " Receita editada com sucesso. ");

	}

	public static Boolean verificaExisteNome(List<Receita> lista, JButton btnEditaReceita, String nome) {
		Boolean existe = false;
		for (Receita rec : lista) {
			if (rec.getNome().equalsIgnoreCase(nome)) {
				JOptionPane.showMessageDialog(null, "ja existe uma receita com este nome");
				existe = true;
				btnEditaReceita.setEnabled(true);
				break;

			}
		}
		return existe;
	}

	public static void naoExisteNome(List<Receita> lista, JButton btnEditaReceita, JButton btnExcluirReceita,
			String nome) {
		Boolean existe = false;
		for (Receita rec : lista) {
			if (nome.equalsIgnoreCase(rec.getNome())) {
				existe = true;
				btnEditaReceita.setEnabled(true);
				btnExcluirReceita.setEnabled(true);
			}
		}
		if (existe == false) {
			JOptionPane.showMessageDialog(null, " Receita não existe ");
		}
		existe = false;
	}

	public static void incluir(List<Receita> lista, Receita r) {

		try {
			lista.add(r);
			GravaReceita gr = new GravaReceita();
			gr.GravaArquivoObj(lista);
			System.out.println("\nReceita Inserida com sucesso");
		} catch (Exception e) {
			System.out.println("\nErro ao incluir receita!");
			System.out.println(e);
		}
	}

	public static void excluir(List<Receita> lista, String nome) {
		List<Receita> lista2 = lista;
		Receita re = new Receita();
		for (Receita r : lista2) {
			if (nome.equals(r.getNome())) {
				re = r;
			}
		}
		lista2.remove(re);
		regravaLista(lista2);
		System.out.println("\nReceita excluida com sucesso");
	}

	public static String buscaSugestão(List<Receita> lista, JCheckBox chckbxAlmSeg, JCheckBox chckbxAlmTer,
			JCheckBox chckbxAlmQua, JCheckBox chckbxAlmQui, JCheckBox chckbxAlmSex, JCheckBox chckbxAlmSab,
			JCheckBox chckbxAlmDom, JCheckBox chckbxJanSeg, JCheckBox chckbxJanTerça, JCheckBox chckbxJanQuarta,
			JCheckBox chckbxJanQuinta, JCheckBox chckbxJanSexta, JCheckBox chckbxJanSbado, JCheckBox chckbxJanDomingo,
			JCheckBox chckbxSobremesa, JCheckBox chckbxDiversos) {
		String sugestao = "\n	    Sugestões de Receitas: \n\n";
		String refeicao = "";

		if (chckbxAlmSeg.isSelected() == false && chckbxAlmTer.isSelected() == false
				&& chckbxAlmQua.isSelected() == false && chckbxAlmQui.isSelected() == false
				&& chckbxAlmSex.isSelected() == false && chckbxAlmSab.isSelected() == false
				&& chckbxAlmDom.isSelected() == false && chckbxJanSeg.isSelected() == false
				&& chckbxJanTerça.isSelected() == false && chckbxJanQuarta.isSelected() == false
				&& chckbxJanQuinta.isSelected() == false && chckbxJanSexta.isSelected() == false
				&& chckbxJanSbado.isSelected() == false && chckbxJanDomingo.isSelected() == false
				&& chckbxSobremesa.isSelected() == false && chckbxDiversos.isSelected() == false) {
			sugestao = "Selecione alguma refeição para receber sugestões.";

		} else {
			if (chckbxAlmSeg.isSelected()) {
				refeicao = "AlmSeg";
				sugestao += ("	Almoço de segunda-feira: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxAlmTer.isSelected()) {
				refeicao = "AlmTer";
				sugestao += ("	Almoço de Terça-feira: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxAlmQua.isSelected()) {
				refeicao = "AlmQua";
				sugestao += ("	Almoço de Quarta-feira: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxAlmQui.isSelected()) {
				refeicao = "AlmQui";
				sugestao += ("	Almoço de Quinta-feira: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxAlmSex.isSelected()) {
				refeicao = "AlmSex";
				sugestao += ("	Almoço de Sexta-feira: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxAlmSab.isSelected()) {
				refeicao = "AlmSab";
				sugestao += ("	Almoço de Sábado: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxAlmDom.isSelected()) {
				refeicao = "AlmDom";
				sugestao += ("	Almoço de Domingo: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxJanSeg.isSelected()) {
				refeicao = "JanSeg";
				sugestao += ("	Jantar de Segunda-feira: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxJanTerça.isSelected()) {
				refeicao = "JanTer";
				sugestao += ("	Jantar de Terça-feira: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxJanQuarta.isSelected()) {
				refeicao = "JanQua";
				sugestao += ("	Jantar de Quarta-feira: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxJanQuinta.isSelected()) {
				refeicao = "JanQui";
				sugestao += ("	Jantar de Quinta-feira: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxJanSexta.isSelected()) {
				refeicao = "JanSex";
				sugestao += ("	Jantar de Sexta-feira: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxJanSbado.isSelected()) {
				refeicao = "JanSab";
				sugestao += ("	Jantar de Sabado: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxJanDomingo.isSelected()) {
				refeicao = "JanDom";
				sugestao += ("	Jantar de Domingo: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxSobremesa.isSelected()) {
				refeicao = "Sobremesa";
				sugestao += ("	Sobremesa: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

			if (chckbxDiversos.isSelected()) {
				refeicao = "Diversos";
				sugestao += ("	Diversos: " + (pesquisaPorRefeição(lista, sugestao, refeicao) + "\n"));
			}

		}

		return sugestao;
	}

	public static String pesquisaPorRefeição(List<Receita> lista, String sugestao, String refeicao) {
		String re = "";
		String sugesAtual = sugestao;
		int indx = 0;
		List<Receita> temp = new ArrayList<Receita>();

		for (Receita rec : lista) {
			if (rec.getRefeição().contains(refeicao) && (!sugesAtual.contains(rec.getNome()))) {
				temp.add(rec);
			}
		}

		if (temp.isEmpty()) {

			for (Receita rec : lista) {
				if (rec.getRefeição().contains(refeicao)) {
					temp.add(rec);
				}
			}
		}

		Random r = new Random();
		int tam = temp.size();
		indx = r.nextInt(tam);
		re = temp.get(indx).getNome();

		return re;
	}

	public static String receitasEscolhidas(List<Receita> lista, String nomes) {

		String recEscolhidas = "\n";

		for (Receita rec : lista) {
			if (nomes.toString().contains(rec.getNome()))
				recEscolhidas += "------------------------------------------------------------------------------------------------------------------------"
						+ "-\n\n\t" + rec.getNome() + "\n\n\t--- Ingredientes ---\n\n " + rec.getIngredientes()
						+ "\n\t--- Modo de preparo ---\n\n " + rec.getModoDePreparo() + "\n\n\n ";
		}

		return recEscolhidas;
	}

	public static String mostraLista(List<Receita> lista) {
		String lis = "\n";

		for (Receita r : lista) {
			lis += "------------------------------------------------------------------------------------------------------";
			lis += "\n";
			lis += r.toString();
			lis += "\n\n";
		}

		return lis;
	}

}
