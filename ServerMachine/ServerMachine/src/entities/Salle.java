/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

/**
 *
 * @author issam
 */
@Entity
@NamedQuery(name = "findAllS", query = "from Salle")
@NamedNativeQuery(name = "findAllSNative", query = "select * from salle", resultClass = Salle.class)
public class Salle implements Serializable  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String code;



    public int getId() {
        return id;
    }

    public Salle(String libelle) {
        this.code = libelle;
    }

    @Override
    public String toString() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Salle() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String libelle) {
        this.code = libelle;
    }
    
    
 
    
}
