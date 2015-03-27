package com.demo.demojpa.domaine;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
/*
 * dans ce cas, les id seront r�cup�r�es depuis les autres tables, � la diff�rence de embeddeId 
 * ou les id compos�s sont cr��s directement dans la table
 * UPDATE � la place du CREATE
 */
@Entity
@IdClass(CommandePK.class)
public class Commande {

	@Id
	@ManyToOne
	private Client client;
	@Id
	@ManyToOne
	private Produit produit;
	private int quantite;
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
}
