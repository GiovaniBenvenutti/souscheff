package br.com.SousCheff.Model;

import javax.swing.JCheckBox;

import br.com.SousCheff.Controller.Receita;

public class CadastraReceita {
	public static Receita incluiReceita() {

		String nome;
		String refeição;
		String ingredientes;
		String modoDePreparo;

		Leitura l = new Leitura();

		nome = l.EntDados("\nQual o nome da receita que deseja incluir?");
		refeição = montaRefeição();
		ingredientes = l.EntDados("\nQuais os ingredientes usados nesta receita?");
		modoDePreparo = l.EntDados("\nQual o modo de preparo desta receita?");

		Receita r = new Receita(nome, refeição, ingredientes, modoDePreparo);

		return r;
	}

	public static String montaRefeição() {

		Leitura l = new Leitura();

		System.out.println("\n\t Esta receita deve ser servida no almoçou janta?");
		System.out.println("\n\t 1...Almoço");
		System.out.println("\n\t 2....Janta");
		System.out.println("\n");

		String hora = l.EntDados("");
		switch (hora) {
		case "1":
			hora = "Alm";
			break;
		case "2":
			hora = "Jan";
			break;
		default:
			System.out.println("\n\t ======================");
			System.out.println("\n\t    entrada invalida");
			System.out.println("\n\t     didite: 1 ou 2");
			System.out.println("\n\t ======================");
		}

		System.out.println("\t Quais dias da semana gostaria de fazer esta receita?");
		System.out.println("\n\t 1........Domingo");
		System.out.println("\n\t 2..Segunda feira");
		System.out.println("\n\t 3....Terça feira");
		System.out.println("\n\t 4...Quarta feira");
		System.out.println("\n\t 5...Quinta feira");
		System.out.println("\n\t 6....Sexta feira");
		System.out.println("\n\t 7.........Sábado");

		String dia = l.EntDados("");

		switch (dia) {
		case "1":
			dia = "Dom";
			break;
		case "2":
			dia = "Seg";
			break;
		case "3":
			dia = "Ter";
			break;
		case "4":
			dia = "Qua";
			break;
		case "5":
			dia = "Qui";
			break;
		case "6":
			dia = "Sex";
			break;
		case "7":
			dia = "Sab";
			break;
		default:
			System.out.println("\n\t ===============================");
			System.out.println("\n\t         entrada invalida");
			System.out.println("\n\t    digite um numero de 1 a 7");
			System.out.println("\n\t ===============================");
		}
		String ref = hora + dia;
		return ref;
	}

	// =============================================================================================================

	public static Receita montaReceitaView(String nome, String refeição, String ingredientes, String modoDePreparo) {

		Receita r = new Receita(nome, refeição, ingredientes, modoDePreparo);

		return r;
	}

	public static String montaRefeiçãoView(JCheckBox chckbxAlmSeg, JCheckBox chckbxJanSeg, JCheckBox chckbxAlmTer,
			JCheckBox chckbxJanTer, JCheckBox chckbxAlmQua, JCheckBox chckbxJanQua, JCheckBox chckbxAlmQui,
			JCheckBox chckbxJanQui, JCheckBox chckbxAlmSex, JCheckBox chckbxJanSex, JCheckBox chckbxAlmSab,
			JCheckBox chckbxJanSab, JCheckBox chckbxAlmDom, JCheckBox chckbxJanDom, JCheckBox chckbxSobremesa, JCheckBox chckbxDiversos) {

		String in = "";
		if (chckbxAlmSeg.isSelected())
			in += "AlmSeg, ";
		if (chckbxJanSeg.isSelected())
			in += "JanSeg, ";
		if (chckbxAlmTer.isSelected())
			in += "AlmTer, ";
		if (chckbxJanTer.isSelected())
			in += "JanTer, ";
		if (chckbxAlmQua.isSelected())
			in += "AlmQua, ";
		if (chckbxJanQua.isSelected())
			in += "JanQua, ";
		if (chckbxAlmQui.isSelected())
			in += "AlmQui, ";
		if (chckbxJanQui.isSelected())
			in += "JanQui, ";
		if (chckbxAlmSex.isSelected())
			in += "AlmSex, ";
		if (chckbxJanSex.isSelected())
			in += "JanSex, ";
		if (chckbxAlmSab.isSelected())
			in += "AlmSab, ";
		if (chckbxJanSab.isSelected())
			in += "JanSab, ";
		if (chckbxAlmDom.isSelected())
			in += "AlmDom, ";
		if (chckbxJanDom.isSelected())
			in += "JanDom, ";
		if (chckbxSobremesa.isSelected())
			in += "Sobremesa, ";
		if(chckbxDiversos.isSelected())
			in += "Diversos.";

		return in;

	}
}
