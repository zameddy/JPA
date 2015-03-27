package com.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Voiture {

	@Id
	@GeneratedValue
		private long id;
		private String marque;
		@ManyToOne
		private Personne proprietaire;
		
		
		public Voiture() {
			super();
			// TODO Auto-generated constructor stub
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getMarque() {
			return marque;
		}
		public void setMarque(String marque) {
			this.marque = marque;
		}
		public Personne getProprietaire() {
			return proprietaire;
		}
		public void setProprietaire(Personne proprietaire) {
			this.proprietaire = proprietaire;
		}
		public Voiture(String marque) {
			super();
			this.marque = marque;
		}
		
		
}
