package br.com.SousCheff.View;

import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import br.com.SousCheff.Controller.MenuMain;
import br.com.SousCheff.Controller.Receita;
import br.com.SousCheff.Model.LeReceita;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class SousCheff extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldExibeSugestões;
	private static List<Receita> lista = new ArrayList<Receita>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SousCheff frame = new SousCheff();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SousCheff() {

		LeReceita lr = new LeReceita();
		lista = lr.LeArquivoObj();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Bom Dia Cheff");
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 710, 40);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("escolha uma refeiçao para receber sugestões");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 47, 710, 25);
		contentPane.add(lblNewLabel_1);

		JPanel panel = new JPanel();
		panel.setBounds(10, 84, 710, 33);
		contentPane.add(panel);
		panel.setLayout(null);

		JCheckBox chckbxAlmSeg = new JCheckBox("Alm Segunda");
		chckbxAlmSeg.setBounds(9, 5, 100, 24);
		chckbxAlmSeg.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(chckbxAlmSeg);

		JCheckBox chckbxAlmTer = new JCheckBox("Alm Terça");
		chckbxAlmTer.setBounds(118, 5, 83, 24);
		chckbxAlmTer.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(chckbxAlmTer);

		JCheckBox chckbxAlmQua = new JCheckBox("Alm Quarta");
		chckbxAlmQua.setBounds(210, 5, 89, 24);
		chckbxAlmQua.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(chckbxAlmQua);

		JCheckBox chckbxAlmQui = new JCheckBox("Alm Quinta");
		chckbxAlmQui.setBounds(308, 5, 87, 24);
		chckbxAlmQui.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(chckbxAlmQui);

		JCheckBox chckbxAlmSex = new JCheckBox("Alm Sexta");
		chckbxAlmSex.setBounds(404, 5, 83, 24);
		chckbxAlmSex.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(chckbxAlmSex);

		JCheckBox chckbxAlmSab = new JCheckBox("Alm Sábado");
		chckbxAlmSab.setBounds(496, 5, 93, 24);
		chckbxAlmSab.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(chckbxAlmSab);

		JCheckBox chckbxAlmDom = new JCheckBox("Alm Domingo");
		chckbxAlmDom.setBounds(598, 5, 100, 24);
		chckbxAlmDom.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(chckbxAlmDom);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 118, 710, 33);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JCheckBox chckbxJanSeg = new JCheckBox("Jan Segunda");
		chckbxJanSeg.setBounds(10, 5, 99, 24);
		chckbxJanSeg.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(chckbxJanSeg);

		JCheckBox chckbxJanTerça = new JCheckBox("Jan Terça");
		chckbxJanTerça.setBounds(119, 5, 82, 24);
		chckbxJanTerça.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(chckbxJanTerça);

		JCheckBox chckbxJanQuarta = new JCheckBox("Jan Quarta");
		chckbxJanQuarta.setBounds(211, 5, 88, 24);
		chckbxJanQuarta.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(chckbxJanQuarta);

		JCheckBox chckbxJanQuinta = new JCheckBox("Jan Quinta");
		chckbxJanQuinta.setBounds(309, 5, 86, 24);
		chckbxJanQuinta.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(chckbxJanQuinta);

		JCheckBox chckbxJanSexta = new JCheckBox("Jan Sexta");
		chckbxJanSexta.setBounds(405, 5, 82, 24);
		chckbxJanSexta.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(chckbxJanSexta);

		JCheckBox chckbxJanSbado = new JCheckBox("Jan Sábado");
		chckbxJanSbado.setBounds(497, 5, 92, 24);
		chckbxJanSbado.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(chckbxJanSbado);

		JCheckBox chckbxJanDomingo = new JCheckBox("Jan Domingo");
		chckbxJanDomingo.setBounds(599, 5, 99, 24);
		chckbxJanDomingo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(chckbxJanDomingo);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 150, 710, 46);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		
		
		JTextArea textAreaTexto = new JTextArea();
		textAreaTexto.setBounds(12, 194, 708, 232);
	//	contentPane.add(textAreaTexto);

		JButton btnNewSugerir = new JButton("Sugerir Receitas");
		btnNewSugerir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LeReceita lr = new LeReceita();
				lista = lr.LeArquivoObj();
				
				textAreaTexto.setText("");
				textAreaTexto.setText(MenuMain.buscaSugestão(lista, chckbxAlmSeg, chckbxAlmTer, chckbxAlmQua, chckbxAlmQui,
						chckbxAlmSex, chckbxAlmSab, chckbxAlmDom, chckbxJanSeg, chckbxJanTerça, chckbxJanQuarta,
						chckbxJanQuinta, chckbxJanSexta, chckbxJanSbado, chckbxJanDomingo));
			}
		});
		btnNewSugerir.setBounds(17, 10, 156, 26);
		panel_2.add(btnNewSugerir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 194, 708, 232);
		contentPane.add(scrollPane);				
		scrollPane.setViewportView(textAreaTexto);

		JButton btnVerReceitas = new JButton("Editar Receitas");
		btnVerReceitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCrud chamaView = new ViewCrud();
				chamaView.setVisible(true);
			}
		});
		btnVerReceitas.setBounds(536, 10, 156, 26);
		panel_2.add(btnVerReceitas);

		JButton btnVerIngredientes = new JButton("Ver Escolhas");
		btnVerIngredientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerEscolhas ve = new VerEscolhas();
				ve.setVisible(true);
				LeReceita lr = new LeReceita();
				lista = lr.LeArquivoObj();
				VerEscolhas.exibeReceitasEscolhidas.setText(MenuMain.receitasEscolhidas(lista, textAreaTexto.getText()));
				
				
			}
		});
		btnVerIngredientes.setBounds(190, 10, 156, 26);
		panel_2.add(btnVerIngredientes);

		JButton btnListaReceitas = new JButton("Lista Completa");
		btnListaReceitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerListaCompleta vlc = new VerListaCompleta();
				vlc.setVisible(true);
				VerListaCompleta.textFieldExibeLista.setText(MenuMain.mostraLista(lista));
			}
		});
		btnListaReceitas.setBounds(363, 10, 156, 26);
		panel_2.add(btnListaReceitas);

		textFieldExibeSugestões = new JTextField();
		textFieldExibeSugestões.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldExibeSugestões.setBounds(10, 194, 710, 232);
		contentPane.add(textFieldExibeSugestões);
		textFieldExibeSugestões.setColumns(10);

	}
}
