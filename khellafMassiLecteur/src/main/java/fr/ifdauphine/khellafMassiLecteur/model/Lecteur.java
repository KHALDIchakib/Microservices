package fr.ifdauphine.khellafMassiLecteur.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lecteur {

    @Id
    @GeneratedValue
    private int id;
    private String genre;
    private String nom;
    private String prenom;
    private String date_naissence;
    private String adresse;

    public Lecteur(){

    }

    public Lecteur(int id, String genre, String nom, String prenom, String date_naissence, String adresse) {
        this.id = id;
        this.genre = genre;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissence = date_naissence;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate_naissence() {
        return date_naissence;
    }

    public void setDate_naissence(String date_naissence) {
        this.date_naissence = date_naissence;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Lecteur{" +
                "id=" + id +
                ", genre='" + genre + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date_naissence='" + date_naissence + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
