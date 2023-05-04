package br.com.SousCheff.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.SousCheff.Model.GravaEscolhas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class VerEscolhas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JTextArea exibeReceitasEscolhidas;
	//private static List<Receita> lista = new ArrayList<Receita>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerEscolhas frame = new VerEscolhas();
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
	public VerEscolhas() {
		
		//LeReceita lr = new LeReceita();
		//lista = lr.LeArquivoObj();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 790, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Receitas Sugeridas");
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 627, 43);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 754, 373);
		contentPane.add(scrollPane);
		
		exibeReceitasEscolhidas = new JTextArea();
		scrollPane.setViewportView(exibeReceitasEscolhidas);
		exibeReceitasEscolhidas.setColumns(10);
		
		JButton btnNewButtonSalvarEscolhas = new JButton("Salvar");
		btnNewButtonSalvarEscolhas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				// cria ummetodo para criar um doc txt na areadetrabalho com a string do campo exibeEscolha
				try {
					GravaEscolhas.GravaArquivo(VerEscolhas.exibeReceitasEscolhidas.getText());
					JOptionPane.showMessageDialog(null, " Cardápio salvo na área de trabalho. ");
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, " falha ao salvar cardápio. ");
				}
				
				
			}
		});
		btnNewButtonSalvarEscolhas.setBounds(647, 16, 117, 36);
		contentPane.add(btnNewButtonSalvarEscolhas);
	
		
		
	}
}
