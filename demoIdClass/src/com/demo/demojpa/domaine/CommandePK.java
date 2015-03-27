package com.demo.demojpa.domaine;

import java.io.Serializable;

public class CommandePK implements Serializable{

	private Client client;
	private Produit produit;
	public CommandePK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommandePK(Client client, Produit produit) {
		super();
		this.client = client;
		this.produit = produit;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((produit == null) ? 0 : produit.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommandePK other = (CommandePK) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (produit == null) {
			if (other.produit != null)
				return false;
		} else if (!produit.equals(other.produit))
			return false;
		return true;
	}
	
	
}
