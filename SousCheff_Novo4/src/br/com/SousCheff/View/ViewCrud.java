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
		setBounds(100, 100, 904, 494);
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

		lblBomDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblBomDia.setBounds(55, 11, 793, 28);
		contentPaneSelecionaRefeições.add(lblBomDia);

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(32, 96, 128, 23);
		contentPaneSelecionaRefeições.add(lblNewLabel);

		lblRefeio.setHorizontalAlignment(SwingConstants.CENTER);
		lblRefeio.setBounds(32, 130, 128, 23);
		contentPaneSelecionaRefeições.add(lblRefeio);

		lblIngredientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngredientes.setBounds(32, 196, 128, 23);
		contentPaneSelecionaRefeições.add(lblIngredientes);

		lblModoDePreparo.setHorizontalAlignment(SwingConstants.CENTER);
		lblModoDePreparo.setBounds(32, 305, 128, 23);
		contentPaneSelecionaRefeições.add(lblModoDePreparo);

		panel.setBounds(170, 130, 678, 56);
		contentPaneSelecionaRefeições.add(panel);
		panel.setLayout(null);

		chckbxAlmSeg.setBounds(14, 0, 80, 23);
		panel.add(chckbxAlmSeg);

		chckbxJanSeg.setBounds(14, 26, 80, 23);
		panel.add(chckbxJanSeg);

		chckbxAlmTer.setBounds(108, 0, 80, 23);
		panel.add(chckbxAlmTer);

		chckbxJanTer.setBounds(108, 26, 80, 23);
		panel.add(chckbxJanTer);

		chckbxAlmQua.setBounds(202, 0, 80, 23);
		panel.add(chckbxAlmQua);

		chckbxJanQua.setBounds(202, 26, 80, 23);
		panel.add(chckbxJanQua);

		chckbxAlmQui.setBounds(296, 0, 80, 23);
		panel.add(chckbxAlmQui);

		chckbxJanQui.setBounds(296, 26, 80, 23);
		panel.add(chckbxJanQui);

		chckbxAlmSex.setBounds(390, 0, 80, 23);
		panel.add(chckbxAlmSex);

		chckbxJanSex.setBounds(390, 26, 80, 23);
		panel.add(chckbxJanSex);

		chckbxAlmSab.setBounds(484, 0, 80, 23);
		panel.add(chckbxAlmSab);

		chckbxJanSab.setBounds(484, 26, 80, 23);
		panel.add(chckbxJanSab);

		chckbxAlmDom.setBounds(578, 0, 80, 23);
		panel.add(chckbxAlmDom);

		chckbxJanDom.setBounds(578, 26, 80, 23);
		panel.add(chckbxJanDom);

		btnNovaReceita.setBounds(32, 50, 128, 23);
		contentPaneSelecionaRefeições.add(btnNovaReceita);
		btnNovaReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetViewCrud.liberaCampos(btnNovaReceita, btnEditaReceita, btnSalvaReceita, btnExcluirReceita,
						btnPesquisar, textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg,
						chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui,
						chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom,
						chckbxJanDom);
			}
		});

		btnEditaReceita.setBounds(370, 50, 128, 23);
		btnEditaReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetViewCrud.liberaCampos(btnNovaReceita, btnEditaReceita, btnSalvaReceita, btnExcluirReceita,
						btnPesquisar, textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg,
						chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui,
						chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom,
						chckbxJanDom);
				btnPesquisar.setEnabled(true);

			}
		});
		contentPaneSelecionaRefeições.add(btnEditaReceita);

		btnSalvaReceita.setBounds(539, 50, 128, 23);
		btnSalvaReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btnPesquisar.isEnabled() == false) {
					if (textNomeReceita.getText() == null || textNomeReceita.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "nome da receita invalido");
					} else if (MenuMain.verificaExisteNome(lista,  btnEditaReceita, textNomeReceita.getText()) == false) {
						String nome = textNomeReceita.getText();
						String refeição = CadastraReceita.montaRefeiçãoView(chckbxAlmSeg, chckbxJanSeg, chckbxAlmTer,
								chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui, chckbxJanQui, chckbxAlmSex,
								chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom, chckbxJanDom);
						String ingredientes = textIngredientes.getText();
						String modoDePreparo = textFieldModoPreparo.getText();
						Receita r = CadastraReceita.montaReceitaView(nome, refeição, ingredientes, modoDePreparo);
						MenuMain.incluir(lista, r);
						JOptionPane.showMessageDialog(null, "Receita incluida com sucesso");
						SetViewCrud.resetTela(btnNovaReceita, btnEditaReceita, btnSalvaReceita, btnExcluirReceita,
								btnPesquisar, textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg,
								chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui,
								chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom,
								chckbxJanDom);
					}
				} else {

					Receita ParaEditar = new Receita();
					ParaEditar = MenuMain.pesquisaPorNome(lista, textNomeReceita.getText());
					ParaEditar.setIngredientes(textIngredientes.getText());
					ParaEditar.setModoDePreparo(textFieldModoPreparo.getText());
					ParaEditar.setRefeição(CadastraReceita.montaRefeiçãoView(chckbxAlmSeg, chckbxJanSeg, chckbxAlmTer,
							chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui, chckbxJanQui, chckbxAlmSex,
							chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom, chckbxJanDom));
					MenuMain.editar(lista, ParaEditar);
					SetViewCrud.resetTela(btnNovaReceita, btnEditaReceita, btnSalvaReceita, btnExcluirReceita,
							btnPesquisar, textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg,
							chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui,
							chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom,
							chckbxJanDom);

				}
			}
		});
		contentPaneSelecionaRefeições.add(btnSalvaReceita);

		btnExcluirReceita.setBounds(708, 50, 128, 23);
		btnExcluirReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNomeReceita.getText();
				MenuMain.excluir(lista, nome);
				JOptionPane.showMessageDialog(null, "Receita excluida com sucesso");
				SetViewCrud.resetTela(btnNovaReceita, btnEditaReceita, btnSalvaReceita, btnExcluirReceita, btnPesquisar,
						textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg, chckbxJanSeg,
						chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui, chckbxJanQui,
						chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom, chckbxJanDom);
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
							chckbxJanSab, chckbxAlmDom, chckbxJanDom);
					SetViewCrud.setBoxRefeição(rec.getRefeição(), chckbxAlmSeg, chckbxJanSeg, chckbxAlmTer,
							chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui, chckbxJanQui, chckbxAlmSex,
							chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom, chckbxJanDom);
				} else {

					SetViewCrud.resetTela(btnNovaReceita, btnEditaReceita, btnSalvaReceita, btnExcluirReceita,
							btnPesquisar, textNomeReceita, textIngredientes, textFieldModoPreparo, chckbxAlmSeg,
							chckbxJanSeg, chckbxAlmTer, chckbxJanTer, chckbxAlmQua, chckbxJanQua, chckbxAlmQui,
							chckbxJanQui, chckbxAlmSex, chckbxJanSex, chckbxAlmSab, chckbxJanSab, chckbxAlmDom,
							chckbxJanDom);
				}
			}
		});
		btnPesquisar.setBounds(201, 50, 128, 23);
		contentPaneSelecionaRefeições.add(btnPesquisar);

		textNomeReceita.setBounds(179, 97, 656, 20);
		contentPaneSelecionaRefeições.add(textNomeReceita);
		textNomeReceita.setColumns(10);
		textNomeReceita.requestFocusInWindow();

		textIngredientes.setBounds(179, 197, 656, 94);
	//	contentPaneSelecionaRefeições.add(textIngredientes);
		textIngredientes.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(179, 197, 656, 94);
		contentPaneSelecionaRefeições.add(scrollPane);				
		scrollPane.setViewportView(textIngredientes);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(179, 306, 656, 125);
		contentPaneSelecionaRefeições.add(scrollPane_1);
		
		
		scrollPane_1.setViewportView(textFieldModoPreparo);
		textFieldModoPreparo.setText("");
		textFieldModoPreparo.setColumns(10);
	}
	
	
	
}
