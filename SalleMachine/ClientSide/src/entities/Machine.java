/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author Badr
 */
public class Machine implements Serializable{
    
    private int id;
    private String marque;
    private String ref;
    private double prix;
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
        this.ref = ref;
        this.marque = marque;
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
