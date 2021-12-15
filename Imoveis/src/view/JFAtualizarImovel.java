package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.bean.Imovel;
import model.dao.ImovelDAO;

import javax.swing.JLabel;

public class JFAtualizarImovel extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private static int id;
	
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private Object txtNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFAtualizarImovel frame = new JFAtualizarImovel(id);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param id2 
	 */
	public JFAtualizarImovel(int id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImovelDAO fdao = new ImovelDAO();
		Imovel f = fdao.read(id);
		
		
		JLabel lblNewLabel = new JLabel("ID: Imovel");
		lblNewLabel.setBounds(303, 24, 95, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblID = new JLabel("New label");
		lblID.setBounds(415, 24, 71, 14);
		contentPane.add(lblID);
		
		JLabel lblNewLabel1 = new JLabel("Alterar Imovel:");
		lblNewLabel1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel1.setBounds(74, 22, 280, 14);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 64, 115, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("N\u00FAmero:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 104, 152, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Bairro:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 149, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Cidade:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 197, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CEP:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 244, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Venda:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(10, 285, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Valor:");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(10, 325, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("ALTERAR");
		btnNewButton.addActionListener(new ActionListener() {
			private JLabel txtEndreco;
			private AbstractButton txtCidade;
			private JLabel txtCEP;
			private AbstractButton txtVenda;
			private AbstractButton txtValor;

			public void actionPerformed(ActionEvent e) {
				Imovel f = newImovel();
				f.setEndereco(((JLabel) txtEndreco).getText());
				f.setNumero(((AbstractButton) txtNumero).getText());
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
		
		lblID.setText("000");
		txtEndereco.setText(f.getEndereco());
		txtBairro.setText(f.getBairro());
		
		textField = new JTextField();
		textField.setBounds(61, 61, 349, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(61, 101, 351, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(60, 146, 350, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(60, 194, 350, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(58, 241, 352, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(61, 282, 349, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(61, 322, 349, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
	}

}
