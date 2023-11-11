package models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Karya extends Model {
    public String judul;

    @Column(columnDefinition = "TEXT")
    public String deskripsi;

    @ManyToOne(cascade=CascadeType.ALL)
    public User user;

    @ManyToOne(cascade=CascadeType.ALL)
    public Genre genre;

    public String toString() {
        return this.judul;
    }

}