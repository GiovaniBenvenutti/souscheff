package br.com.SousCheff.View;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SetViewCrud {

	public static void resetTela(JButton btnNovaReceita, JButton btnEditaReceita, JButton btnSalvaReceita,
			JButton btnExcluirReceita, JButton btnPesquisar, JTextField textNomeReceita, JTextArea textIngredientes,
			JTextArea textFieldModoPreparo, JCheckBox chckbxAlmSeg, JCheckBox chckbxJanSeg, JCheckBox chckbxAlmTer,
			JCheckBox chckbxJanTer, JCheckBox chckbxAlmQua, JCheckBox chckbxJanQua, JCheckBox chckbxAlmQui,
			JCheckBox chckbxJanQui, JCheckBox chckbxAlmSex, JCheckBox chckbxJanSex, JCheckBox chckbxAlmSab,
			JCheckBox chckbxJanSab, JCheckBox chckbxAlmDom, JCheckBox chckbxJanDom) {

		btnNovaReceita.setEnabled(true);
		btnEditaReceita.setEnabled(false);
		btnSalvaReceita.setEnabled(false);
		btnExcluirReceita.setEnabled(false);
		btnPesquisar.setEnabled(true);
		textNomeReceita.setEditable(true);
		textIngredientes.setEditable(false);
		textIngredientes.setText("");
		textFieldModoPreparo.setEditable(false);
		textFieldModoPreparo.setText("");
		chckbxAlmSeg.setEnabled(false);
		chckbxJanSeg.setEnabled(false);
		chckbxAlmTer.setEnabled(false);
		chckbxJanTer.setEnabled(false);
		chckbxAlmQua.setEnabled(false);
		chckbxJanQua.setEnabled(false);
		chckbxAlmQui.setEnabled(false);
		chckbxJanQui.setEnabled(false);
		chckbxAlmSex.setEnabled(false);
		chckbxJanSex.setEnabled(false);
		chckbxAlmSab.setEnabled(false);
		chckbxJanSab.setEnabled(false);
		chckbxAlmDom.setEnabled(false);
		chckbxJanDom.setEnabled(false);
		SetViewCrud.limpaBoxRefeição(chckbxAlmSeg, chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua,
				chckbxAlmQui, chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom,
				chckbxJanDom);
	}

	public static void liberaCampos(JButton btnNovaReceita, JButton btnEditaReceita, JButton btnSalvaReceita,
			JButton btnExcluirReceita, JButton btnPesquisar, JTextField textNomeReceita, JTextArea textIngredientes,
			JTextArea textFieldModoPreparo, JCheckBox chckbxAlmSeg, JCheckBox chckbxJanSeg, JCheckBox chckbxAlmTer,
			JCheckBox chckbxJanTer, JCheckBox chckbxAlmQua, JCheckBox chckbxJanQua, JCheckBox chckbxAlmQui,
			JCheckBox chckbxJanQui, JCheckBox chckbxAlmSex, JCheckBox chckbxJanSex, JCheckBox chckbxAlmSab,
			JCheckBox chckbxJanSab, JCheckBox chckbxAlmDom, JCheckBox chckbxJanDom) {

		btnNovaReceita.setEnabled(false);
		btnEditaReceita.setEnabled(false);
		btnSalvaReceita.setEnabled(true);
		btnExcluirReceita.setEnabled(false);
		btnPesquisar.setEnabled(false);
		textNomeReceita.setEditable(true);
		textIngredientes.setEditable(true);
		textFieldModoPreparo.setEditable(true);
		chckbxAlmSeg.setEnabled(true);
		chckbxJanSeg.setEnabled(true);
		chckbxAlmTer.setEnabled(true);
		chckbxJanTer.setEnabled(true);
		chckbxAlmQua.setEnabled(true);
		chckbxJanQua.setEnabled(true);
		chckbxAlmQui.setEnabled(true);
		chckbxJanQui.setEnabled(true);
		chckbxAlmSex.setEnabled(true);
		chckbxJanSex.setEnabled(true);
		chckbxAlmSab.setEnabled(true);
		chckbxJanSab.setEnabled(true);
		chckbxAlmDom.setEnabled(true);
		chckbxJanDom.setEnabled(true);

	/*	SetViewCrud.limpaCampos(textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg, chckbxJanSeg,
				chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui, chckbxJanQui, chckbxAlmSex,
				chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom, chckbxJanDom);
	*/
	}

	public static void limpaCampos(JTextField textNomeReceita, JTextArea textIngredientes,
			JTextArea textFieldModoPreparo, JCheckBox chckbxAlmSeg, JCheckBox chckbxJanSeg, JCheckBox chckbxAlmTer,
			JCheckBox chckbxJanTer, JCheckBox chckbxAlmQua, JCheckBox chckbxJanQua, JCheckBox chckbxAlmQui,
			JCheckBox chckbxJanQui, JCheckBox chckbxAlmSex, JCheckBox chckbxJanSex, JCheckBox chckbxAlmSab,
			JCheckBox chckbxJanSab, JCheckBox chckbxAlmDom, JCheckBox chckbxJanDom) {
		
		textIngredientes.setText("");
		textFieldModoPreparo.setText("");

		SetViewCrud.limpaBoxRefeição(chckbxAlmSeg, chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua,
				chckbxAlmQui, chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom,
				chckbxJanDom);

	}

	public static void setBoxRefeição(String refeição, JCheckBox chckbxAlmSeg, JCheckBox chckbxJanSeg,
			JCheckBox chckbxAlmTer, JCheckBox chckbxJanTer, JCheckBox chckbxAlmQua, JCheckBox chckbxJanQua,
			JCheckBox chckbxAlmQui, JCheckBox chckbxJanQui, JCheckBox chckbxAlmSex, JCheckBox chckbxJanSex,
			JCheckBox chckbxAlmSab, JCheckBox chckbxJanSab, JCheckBox chckbxAlmDom, JCheckBox chckbxJanDom) {

		if (refeição.contains("AlmSeg"))
			chckbxAlmSeg.setSelected(true);
		if (refeição.contains("JanSeg"))
			chckbxJanSeg.setSelected(true);
		if (refeição.contains("AlmTer"))
			chckbxAlmTer.setSelected(true);
		if (refeição.contains("JanTer"))
			chckbxJanTer.setSelected(true);
		if (refeição.contains("AlmQua"))
			chckbxAlmQua.setSelected(true);
		if (refeição.contains("JanQua"))
			chckbxJanQua.setSelected(true);
		if (refeição.contains("AlmQui"))
			chckbxAlmQui.setSelected(true);
		if (refeição.contains("JanQui"))
			chckbxJanQui.setSelected(true);
		if (refeição.contains("AlmSex"))
			chckbxAlmSex.setSelected(true);
		if (refeição.contains("JanSex"))
			chckbxJanSex.setSelected(true);
		if (refeição.contains("AlmSab"))
			chckbxAlmSab.setSelected(true);
		if (refeição.contains("JanSab"))
			chckbxJanSab.setSelected(true);
		if (refeição.contains("AlmDom"))
			chckbxAlmDom.setSelected(true);
		if (refeição.contains("JanDom"))
			chckbxJanDom.setSelected(true);
	}

	public static void limpaBoxRefeição(JCheckBox chckbxAlmSeg, JCheckBox chckbxJanSeg, JCheckBox chckbxAlmTer,
			JCheckBox chckbxJanTer, JCheckBox chckbxAlmQua, JCheckBox chckbxJanQua, JCheckBox chckbxAlmQui,
			JCheckBox chckbxJanQui, JCheckBox chckbxAlmSex, JCheckBox chckbxJanSex, JCheckBox chckbxAlmSab,
			JCheckBox chckbxJanSab, JCheckBox chckbxAlmDom, JCheckBox chckbxJanDom) {

		chckbxAlmSeg.setSelected(false);
		chckbxJanSeg.setSelected(false);
		chckbxAlmTer.setSelected(false);
		chckbxJanTer.setSelected(false);
		chckbxAlmQua.setSelected(false);
		chckbxJanQua.setSelected(false);
		chckbxAlmQui.setSelected(false);
		chckbxJanQui.setSelected(false);
		chckbxAlmSex.setSelected(false);
		chckbxJanSex.setSelected(false);
		chckbxAlmSab.setSelected(false);
		chckbxJanSab.setSelected(false);
		chckbxAlmDom.setSelected(false);
		chckbxJanDom.setSelected(false);

	}

}
