package metier.entites;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Produit implements Serializable{
	private Long id;
	private String designation;
	private double prix;
	private int quantite;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String disignation, double prix, int quantite) {
		this.designation = disignation;
		this.prix = prix;
		this.quantite = quantite;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String disignation) {
		this.designation = disignation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", disignation=" + designation + ", prix=" + prix + ", quantite=" + quantite + "]";
	}
	
	
}
