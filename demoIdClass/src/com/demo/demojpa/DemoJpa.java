package com.demo.demojpa;



import com.demo.dao.ClientManager;
import com.demo.dao.CommandeManager;
import com.demo.dao.ProduitManager;
import com.demo.demojpa.domaine.Client;
import com.demo.demojpa.domaine.Commande;
import com.demo.demojpa.domaine.Produit;

public class DemoJpa {

	public static void main(String[] args) {
		
		CommandeManager cm = new CommandeManager();
		ProduitManager pm = new ProduitManager();
		ClientManager clm = new ClientManager();
		
		/*Client c1 = new Client("zam","eddy");
		Produit p = new Produit("Ordinateur");*/
		
		Commande c = new Commande();
		/*c.setClient(c1);
		c.setProduit(p);
		c.setQuantite(10);*/
		
		/*pm.create(p);
		clm.create(c1);*/
		Client c1 = clm.find(1L);
		Produit p = pm.find(1L);
		
		c.setClient(c1);
		c.setProduit(p);
		c.setQuantite(10);
		// le create ne marche pas car les id sont déja créées dans les classes Produit et Client
		cm.update(c);
		
	}

}
