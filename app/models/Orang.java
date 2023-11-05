package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Orang extends Model {
    public String nama;
	public String notelp;
	public String alamat;

	@ManyToOne
	public GolonganDarah namagoldar;

	@ManyToOne
	public Kabupaten namakabupaten;
	
	public String toString() {
		return nama;
	}

}
