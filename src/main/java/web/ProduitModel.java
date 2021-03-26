package web;

import java.util.*;

import metier.entites.Produit;

public class ProduitModel {
	private String motCle;
	private List<Produit> produits = new ArrayList<Produit>();
	public ProduitModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
}
