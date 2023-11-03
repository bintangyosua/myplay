package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class GolonganDarah extends Model {
	public String namagoldar;
	
	public String toString() {
		return this.namagoldar;
	}
}

