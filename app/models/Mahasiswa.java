package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Mahasiswa extends Model {
    public String nama;
    public String nim;
    public String alamat;
    public Date tanggallhr;
}
