package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Genre extends Model {
    public String genre;

    public String toString() {
        return this.genre;
    }
    
}
