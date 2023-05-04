package br.com.SousCheff.View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import br.com.SousCheff.Controller.MenuMain;
import br.com.SousCheff.Controller.Receita;
import br.com.SousCheff.Model.CadastraReceita;
import br.com.SousCheff.Model.LeReceita;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class ViewCrud extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPaneSelecionaRefeições;
	private JTextField textNomeReceita;
	private JTextArea textIngredientes;
	private static List<Receita> lista = new ArrayList<Receita>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCrud frame = new ViewCrud();
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
	public ViewCrud() {

		LeReceita lr = new LeReceita();
		lista = lr.LeArquivoObj();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 869, 494);
		contentPaneSelecionaRefeições = new JPanel();
		contentPaneSelecionaRefeições.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneSelecionaRefeições);
		contentPaneSelecionaRefeições.setLayout(null);
		JButton btnNovaReceita = new JButton("Nova");
		JButton btnEditaReceita = new JButton("Editar");
		JButton btnSalvaReceita = new JButton("Salvar");
		JButton btnExcluirReceita = new JButton("Excluir");
		JButton btnPesquisar = new JButton("Pesquisar");
		textNomeReceita = new JTextField();
		textNomeReceita.requestFocus();
		textNomeReceita.getCursor();
		textIngredientes = new JTextArea();
		JTextArea textFieldModoPreparo = new JTextArea();
		JLabel lblBomDia = new JLabel("Bom Dia Cheff !");
		lblBomDia.setFont(new Font("Monotype Corsiva", Font.BOLD, 22));
		JLabel lblNewLabel = new JLabel("Nome da Receita :");
		JLabel lblRefeio = new JLabel("Refeição :");
		JLabel lblIngredientes = new JLabel("Ingredientes :");
		JLabel lblModoDePreparo = new JLabel("Modo de Preparo :");
		JPanel panel = new JPanel();
		JCheckBox chckbxAlmSeg = new JCheckBox("Alm Seg");
		JCheckBox chckbxJanSeg = new JCheckBox("Jan Seg");
		JCheckBox chckbxAlmTer = new JCheckBox("Alm Ter");
		JCheckBox chckbxJanTer = new JCheckBox("Jan Ter");
		JCheckBox chckbxAlmQua = new JCheckBox("Alm Qua");
		JCheckBox chckbxJanQua = new JCheckBox("Jan Qua");
		JCheckBox chckbxAlmQui = new JCheckBox("Alm Qui");
		JCheckBox chckbxJanQui = new JCheckBox("Jan Qui");
		JCheckBox chckbxAlmSex = new JCheckBox("Alm Sex");
		JCheckBox chckbxJanSex = new JCheckBox("Jan Sex");
		JCheckBox chckbxAlmSab = new JCheckBox("Alm Sab");
		JCheckBox chckbxJanSab = new JCheckBox("Jan Sab");
		JCheckBox chckbxAlmDom = new JCheckBox("Alm Dom");
		JCheckBox chckbxJanDom = new JCheckBox("Jan Dom");
		JCheckBox chckbxSobremesa = new JCheckBox("Sobremesa");
		JCheckBox chckbxDiversos = new JCheckBox("Diversos");

		lblBomDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblBomDia.setBounds(10, 11, 838, 28);
		contentPaneSelecionaRefeições.add(lblBomDia);

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 96, 128, 23);
		contentPaneSelecionaRefeições.add(lblNewLabel);

		lblRefeio.setHorizontalAlignment(SwingConstants.CENTER);
		lblRefeio.setBounds(10, 129, 128, 23);
		contentPaneSelecionaRefeições.add(lblRefeio);

		lblIngredientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngredientes.setBounds(10, 199, 128, 23);
		contentPaneSelecionaRefeições.add(lblIngredientes);

		lblModoDePreparo.setHorizontalAlignment(SwingConstants.CENTER);
		lblModoDePreparo.setBounds(10, 308, 128, 23);
		contentPaneSelecionaRefeições.add(lblModoDePreparo);

		panel.setBounds(118, 130, 730, 56);
		contentPaneSelecionaRefeições.add(panel);
		panel.setLayout(null);

		chckbxAlmSeg.setBounds(8, 0, 80, 23);
		panel.add(chckbxAlmSeg);

		chckbxJanSeg.setBounds(8, 26, 80, 23);
		panel.add(chckbxJanSeg);

		chckbxAlmTer.setBounds(96, 0, 80, 23);
		panel.add(chckbxAlmTer);

		chckbxJanTer.setBounds(96, 26, 80, 23);
		panel.add(chckbxJanTer);

		chckbxAlmQua.setBounds(184, 0, 80, 23);
		panel.add(chckbxAlmQua);

		chckbxJanQua.setBounds(184, 26, 80, 23);
		panel.add(chckbxJanQua);

		chckbxAlmQui.setBounds(272, 0, 80, 23);
		panel.add(chckbxAlmQui);

		chckbxJanQui.setBounds(272, 26, 80, 23);
		panel.add(chckbxJanQui);

		chckbxAlmSex.setBounds(360, 0, 80, 23);
		panel.add(chckbxAlmSex);

		chckbxJanSex.setBounds(360, 26, 80, 23);
		panel.add(chckbxJanSex);

		chckbxAlmSab.setBounds(448, 0, 80, 23);
		panel.add(chckbxAlmSab);

		chckbxJanSab.setBounds(448, 26, 80, 23);
		panel.add(chckbxJanSab);

		chckbxAlmDom.setBounds(536, 0, 80, 23);
		panel.add(chckbxAlmDom);

		chckbxJanDom.setBounds(536, 26, 80, 23);
		panel.add(chckbxJanDom);
	
		chckbxSobremesa.setBounds(624, 0, 97, 23);
		panel.add(chckbxSobremesa);		
		
		chckbxDiversos.setBounds(624, 26, 97, 23);
		panel.add(chckbxDiversos);

		btnNovaReceita.setBounds(35, 50, 128, 23);
		contentPaneSelecionaRefeições.add(btnNovaReceita);
		btnNovaReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetViewCrud.liberaCampos(btnNovaReceita, btnEditaReceita, btnSalvaReceita, btnExcluirReceita,
						btnPesquisar, textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg,
						chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui,
						chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom,
						chckbxJanDom, chckbxSobremesa, chckbxDiversos);
			}
		});

		btnEditaReceita.setBounds(361, 50, 128, 23);
		btnEditaReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetViewCrud.liberaCampos(btnNovaReceita, btnEditaReceita, btnSalvaReceita, btnExcluirReceita,
						btnPesquisar, textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg,
						chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui,
						chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom,
						chckbxJanDom, chckbxSobremesa, chckbxDiversos);
				btnPesquisar.setEnabled(true);

			}
		});
		contentPaneSelecionaRefeições.add(btnEditaReceita);

		btnSalvaReceita.setBounds(524, 50, 128, 23);
		btnSalvaReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btnPesquisar.isEnabled() == false) {
					if (textNomeReceita.getText() == null || textNomeReceita.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "nome da receita invalido");
					} else if (MenuMain.verificaExisteNome(lista,  btnEditaReceita, textNomeReceita.getText()) == false) {
						String nome = textNomeReceita.getText();
						String refeição = CadastraReceita.montaRefeiçãoView(chckbxAlmSeg, chckbxJanSeg, chckbxAlmTer,
								chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui, chckbxJanQui, chckbxAlmSex,
								chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom, chckbxJanDom, chckbxSobremesa, chckbxDiversos);
						String ingredientes = textIngredientes.getText();
						String modoDePreparo = textFieldModoPreparo.getText();
						Receita r = CadastraReceita.montaReceitaView(nome, refeição, ingredientes, modoDePreparo);
						MenuMain.incluir(lista, r);
						JOptionPane.showMessageDialog(null, "Receita incluida com sucesso");
						SetViewCrud.resetTela(btnNovaReceita, btnEditaReceita, btnSalvaReceita, btnExcluirReceita,
								btnPesquisar, textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg,
								chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui,
								chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom,
								chckbxJanDom, chckbxSobremesa, chckbxDiversos);
					}
				} else {

					Receita ParaEditar = new Receita();
					ParaEditar = MenuMain.pesquisaPorNome(lista, textNomeReceita.getText());
					ParaEditar.setIngredientes(textIngredientes.getText());
					ParaEditar.setModoDePreparo(textFieldModoPreparo.getText());
					ParaEditar.setRefeição(CadastraReceita.montaRefeiçãoView(chckbxAlmSeg, chckbxJanSeg, chckbxAlmTer,
							chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui, chckbxJanQui, chckbxAlmSex,
							chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom, chckbxJanDom, chckbxSobremesa, chckbxDiversos));
					MenuMain.editar(lista, ParaEditar);
					SetViewCrud.resetTela(btnNovaReceita, btnEditaReceita, btnSalvaReceita, btnExcluirReceita,
							btnPesquisar, textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg,
							chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui,
							chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom,
							chckbxJanDom, chckbxSobremesa, chckbxDiversos);

				}
			}
		});
		contentPaneSelecionaRefeições.add(btnSalvaReceita);

		btnExcluirReceita.setBounds(687, 50, 128, 23);
		btnExcluirReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNomeReceita.getText();
				MenuMain.excluir(lista, nome);
				JOptionPane.showMessageDialog(null, "Receita excluida com sucesso");
				SetViewCrud.resetTela(btnNovaReceita, btnEditaReceita, btnSalvaReceita, btnExcluirReceita, btnPesquisar,
						textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg, chckbxJanSeg,
						chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui, chckbxJanQui,
						chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom, chckbxJanDom, chckbxSobremesa, chckbxDiversos);
			}
		});
		contentPaneSelecionaRefeições.add(btnExcluirReceita);

		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnSalvaReceita.isEnabled() == false) {
					Receita rec = new Receita();
					MenuMain.naoExisteNome(lista, btnEditaReceita, btnExcluirReceita, textNomeReceita.getText());
					rec = MenuMain.pesquisaPorNome(lista, textNomeReceita.getText());
					textIngredientes.setText(rec.getIngredientes());
					textFieldModoPreparo.setText(rec.getModoDePreparo());
					SetViewCrud.limpaBoxRefeição(chckbxAlmSeg, chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua,
							chckbxJanQua, chckbxAlmQui, chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab,
							chckbxJanSab, chckbxAlmDom, chckbxJanDom, chckbxSobremesa, chckbxDiversos);
					SetViewCrud.setBoxRefeição(rec.getRefeição(), chckbxAlmSeg, chckbxJanSeg, chckbxAlmTer,
							chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui, chckbxJanQui, chckbxAlmSex,
							chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom, chckbxJanDom, chckbxSobremesa, chckbxDiversos);
				} else {

					SetViewCrud.resetTela(btnNovaReceita, btnEditaReceita, btnSalvaReceita, btnExcluirReceita,
							btnPesquisar, textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg,
							chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui,
							chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom,
							chckbxJanDom, chckbxSobremesa, chckbxDiversos);
				}
			}
		});
		btnPesquisar.setBounds(198, 50, 128, 23);
		contentPaneSelecionaRefeições.add(btnPesquisar);

		textNomeReceita.setBounds(136, 97, 699, 20);
		contentPaneSelecionaRefeições.add(textNomeReceita);
		textNomeReceita.setColumns(10);
		textNomeReceita.requestFocusInWindow();

		textIngredientes.setBounds(179, 197, 656, 94);
		textIngredientes.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(136, 197, 699, 94);
		contentPaneSelecionaRefeições.add(scrollPane);				
		scrollPane.setViewportView(textIngredientes);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(136, 306, 699, 125);
		contentPaneSelecionaRefeições.add(scrollPane_1);
		
		
		scrollPane_1.setViewportView(textFieldModoPreparo);
		textFieldModoPreparo.setText("");
		textFieldModoPreparo.setColumns(10);
	}
}
