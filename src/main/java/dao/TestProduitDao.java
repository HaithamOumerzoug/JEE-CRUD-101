package dao;

import metier.entites.Produit;

public class TestProduitDao {

	public static void main(String[] args) {
		
		ProduitDaoImp dao =new ProduitDaoImp();
		/*
		 * Produit p1 = dao.AddProd(new Produit("HP ProBook 4330s",7000,10));
			Produit p2 = dao.AddProd(new Produit("ACCENT",8000,20));
			Produit p3 = dao.AddProd(new Produit("HUAWEI",9000,30));
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			System.out.println(p3.toString());
		 * */
		System.out.println(dao.SearchProd("%HP%"));
		
	}

}