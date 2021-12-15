package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.bean.Imovel;
import model.dao.ImovelDAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFListarImoveis extends JFrame {

	private JPanel contentPane;
	private JTable JTimoveis;
	private JTable JFImovel;
	private static final long serialVersionUID = 7526472295622776147L; //
	protected static final JTable JTImovel = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFListarImoveis frame = new JFListarImoveis();
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
	public JFListarImoveis() {
		setTitle("Listar Imoveis");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Listar Imoveis");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 11, 209, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 613, 177);
		contentPane.add(scrollPane);
		
		JTimoveis = new JTable();
		JTimoveis.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Cidade", "Numero", "Endere\u00E7o", "idImovel"
			}
		));
		scrollPane.setViewportView(JTimoveis);
		
		JButton btnNewButton = new JButton("Cadastrar Imovel");
		btnNewButton.setBounds(10, 224, 140, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar Imovel");
		btnNewButton_1.setBounds(212, 224, 151, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Excluir Imovel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JTImovel.getSelectedRow()!= -1) {
				int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o imovel selecionado?" , "Exclusão", JOptionPane.YES_NO_OPTION);
				     if(opcao == 0) {
					  ImovelDAO dao = new ImovelDAO();
					  Imovel f = new Imovel();
					  f.setIdImovel((int)JTImovel.getValueAt(JTImovel.getSelectedRow(), 0));
					  dao.delete(f);
			}
			     } else {
					JOptionPane.showMessageDialog(null,"Selecione um imovel!!");
				}
				readJTable();
			}
		});
		btnNewButton_2.setBounds(418, 224, 140, 23);
		contentPane.add(btnNewButton_2);
		readJTable();
		
	}
	public void readJTable() {
		DefaultTableModel modelo = (DefaultTableModel) JFImovel.getModel();
		modelo.setNumRows(0);
		ImovelDAO fdao = new ImovelDAO ();
		for (Imovel f : fdao.read()) {
			modelo.addRow(new Object [] {
				f.getIdImovel(),
				f.getEndereco(),
				f.getNumero(),
				f.getBairro()
			
			});
		}
	}
}
	

			
		
			


