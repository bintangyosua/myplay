package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Genre extends Model {
    public String genre;

    public String toString() {
        return this.genre;
    }
    
}
