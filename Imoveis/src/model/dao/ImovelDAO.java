package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.bean.Imovel;

//metodos
public class ImovelDAO {
	
	public void create (Imovel f) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt= con.prepareStatement("INSERT INTO Imovel (endereco, numero, bairro, cidade, CEP, venda, valor) VALUES(?,?,?,?,?,?,?)");
			stmt.setString(1, f.getEndereco());
			
			stmt.setInt(2, f.getNumero());
			
			stmt.setString(3, f.getBairro());
			
			stmt.setString(4, f.getCidade());
			
			stmt.setInt(5, f.getCEP());
			
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!!");
			
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar!!" + e);
	} 
	}
	//metodo list para trazer os dados do banco
	public List<Imovel> read (){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Imovel> imoveis = new ArrayList<>();
		
		try {
			stmt = con.prepareStatement("SELECT * FROM Imovel");
			rs = stmt.executeQuery();
			while(rs.next()) {
				Imovel f = new Imovel ();
				f.setIdImovel(rs.getInt("idImovel"));
				f.setEndereco(rs.getString("endereco"));
				f.setNumero(rs.getInt("numero"));
				f.setBairro(rs.getString("bairro"));
				f.setCidade(rs.getString("cidade"));
				f.setCEP(rs.getInt("CEP"));
				f.setVenda(rs.getBoolean("venda"));
				
				imoveis.add(f);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao exibir as informações do BD!!" + e);
			e.printStackTrace();
		}finally {
		ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return imoveis;
	} 
	//metodo de apagar
	public void delete (Imovel f) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("DELETE FROM Imovel WHERE idImovel=?");
			stmt.setInt(1, f.getIdImovel());
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Imovel excluido com sucesso!!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e);
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	//alteracao
	// primeiro metodo
	//metodoread
	public Imovel read (int id) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Imovel f = new Imovel ();
		
		try {
			stmt = con.prepareStatement("SELECT * FROM imovel WHERE idImovel=? LIMIT 1;");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if(rs != null && rs.next()) {
				f.setIdImovel(rs.getInt("idImovel"));
				f.setEndereco(rs.getString("endereco"));
				f.setNumero(rs.getInt("numero"));
				f.setBairro(rs.getString("bairro"));
				f.setCidade(rs.getString("cidade"));
				f.setCEP(rs.getInt("CEP"));
				f.setValor(rs.getBoolean("valor"));
				f.setVenda(rs.getBoolean("venda"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return f;
	}
	//segundo metodo
	public void update (Imovel f) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt= con.prepareStatement("UPDATE Imovel SET (endereco=?, numero=?, bairro=?, cidade=?, CEP=?, venda=?, valor=? WHERE idImovel=?;");
			stmt.setString(1, f.getEndereco());
			stmt.setInt(2, f.getNumero());
			stmt.setString(3, f.getBairro());
			stmt.setString(4, f.getCidade());
			stmt.setInt(5, f.getCEP());
			stmt.setInt(7, f.getIdImovel());
			stmt.executeUpdate();
			
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!");
			
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao alterar!!" + e);
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
}
	
