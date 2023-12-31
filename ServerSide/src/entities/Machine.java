/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

/**
 *
 * @author Badr
 */
@Entity
@NamedNativeQuery(name = "findAllNative", query = "select * from machine", resultClass = Machine.class)
@NamedQuery(name = "findMachinesBySalle", query = "from Machine where salle = :idSalle")
public class Machine implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marque;
    private String ref;
    private double prix;
    @ManyToOne
    private Salle salle;

    public Machine() {
    }
    
    public Machine( String ref, String marque, double prix, Salle salle) {
        this.marque = marque;
        this.ref = ref;
        this.prix = prix;
        this.salle = salle;
    }

    public Machine(int id, String ref, String marque, double prix, Salle salle) {
        this.id = id;
        this.marque = marque;
        this.ref = ref;
        this.prix = prix;
        this.salle = salle;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", marque=" + marque + ", ref=" + ref + ", prix=" + prix + ", salle=" + salle + '}';
    }
    
    
    
    
}
