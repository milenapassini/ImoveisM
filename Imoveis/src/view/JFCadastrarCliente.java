package view;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.bean.Imovel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFCadastrarCliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBairro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFCadastrarCliente frame = new JFCadastrarCliente();
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
	public JFCadastrarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Imovel:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(150, 11, 280, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 64, 115, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(62, 61, 376, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("N\u00FAmero:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 104, 152, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(62, 101, 376, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Bairro:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 149, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(62, 146, 376, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cidade:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 197, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		Component textField_3 = new JTextField();
		textField_3.setBounds(62, 194, 376, 20);
		contentPane.add(textField_3);
		((JTextField) textField_3).setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("CEP:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 244, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(62, 241, 376, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Venda:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(10, 285, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JTextField textField_5 = new JTextField();
		textField_5.setBounds(62, 282, 376, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Valor:");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(10, 325, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JTextField textField_6 = new JTextField();
		textField_6.setBounds(62, 322, 376, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			private JLabel txtNumero;
			private JLabel txtEndreco;
			private JLabel txtCidade;
			private JLabel txtCEP;
			private JLabel txtVenda;
			private JLabel txtValor;


			public void actionPerformed(ActionEvent e) {
				Imovel f = newImovel();
				f.setEndereco(((JLabel) txtEndreco).getText());
				f.setNumero(txtNumero.getText());
				f.setBairro(txtBairro.getText());
				f.setCidade(txtCidade.getText());
				f.setCEP(((JLabel) txtCEP).getText());
				f.setVenda(txtVenda.getText());
				f.setValor(txtValor.getText());
				
				}
			

			private Imovel newImovel() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnNewButton.setBounds(150, 373, 152, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LIMPAR");
		btnNewButton_1.setBounds(22, 373, 105, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CANCELAR");
		btnNewButton_2.setBounds(335, 373, 95, 23);
		contentPane.add(btnNewButton_2);
	}

}
