package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import metier.entites.Produit;

public class ProduitDaoImp implements IProduitDao{
	private Connection con = SingletonConnection.getConn();
	@Override
	public Produit AddProd(Produit p) {
		
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO PRODUITS (DESIGNATION,PRIX,QUANTITE) VALUES (?,?,?)");
			ps.setString(1, p.getDesignation());
			ps.setDouble(2, p.getPrix());
			ps.setInt(3, p.getQuantite());
			ps.executeUpdate();
			PreparedStatement ps2 = con.prepareStatement("SELECT MAX(ID) AS MAX_ID FROM PRODUITS");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()){
				p.setId(rs.getLong("MAX_ID"));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public List<Produit> SearchProd(String mc) {
		List<Produit> produits = new ArrayList<Produit>();
		//Connection con = SingletonConnection.getConn();
		try {
			PreparedStatement ps = con.prepareStatement
					("SELECT * FROM PRODUITS WHERE DESIGNATION LIKE ?");
			ps.setString(1, mc);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produit p = new Produit();
				p.setId(rs.getLong("ID"));
				p.setDesignation(rs.getString("designation"));
				p.setPrix(rs.getDouble("PRIX"));
				p.setQuantite(rs.getInt("QUANTITE"));
				produits.add(p);
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return produits;
	}

	@Override
	public Produit getProd(Long id) {
		Produit produit = new Produit();
		try {
			PreparedStatement ps = con.prepareStatement("SELECT DESIGNATION,PRIX,QUANTITE FROM PRODUITS WHERE ID=?");
			ps.setLong(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				produit.setId(id);
				produit.setDesignation(rs.getString("DESIGNATION"));
				produit.setPrix(rs.getDouble("PRIX"));
				produit.setQuantite(rs.getInt("QUANTITE"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return produit;
	}

	@Override
	public Produit Update(Produit p) {
		Long id = p.getId();
		String Designation = p.getDesignation();
		double Prix = p.getPrix();
		int Quantite = p.getQuantite();
		try {
			PreparedStatement ps = con.prepareStatement("UPDATE PRODUITS SET DESIGNATION=? , PRIX = ? ,QUANTITE=? WHERE ID=? ");
			ps.setString(1, Designation);
			ps.setDouble(2, Prix);
			ps.setInt(3, Quantite);
			ps.setLong(4, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public void Delete(Long id) {
		try {
			PreparedStatement ps = con.prepareStatement("DELETE FROM PRODUITS WHERE ID=?");
			ps.setLong(1, id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
