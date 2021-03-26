package dao;

import java.util.List;

import metier.entites.Produit;

public interface IProduitDao {
	public Produit AddProd(Produit p);
	public List<Produit> SearchProd(String mc);
	public Produit getProd(Long id);
	public Produit Update(Produit p);
	public void Delete(Long id);
}
