package fr.diginamic.entity;


import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.A;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name = "DATE_DE_NAISSANCE")
    private LocalDateTime date_de_naissance;
    @ManyToOne
    @JoinColumn(name = "ID_BANQUE")
    private Banque banques;
    @ManyToMany
    @JoinTable(name = "CLI_COM",
            joinColumns = @JoinColumn(name = "ID_CLI", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_COM", referencedColumnName = "ID")
    )
    private Set<Compte> comptes;

    @Embedded
    private Adresse adresse;

    public Client(){
        adresse = new Adresse();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDateTime getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(LocalDateTime date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public Banque getBanques() {
        return banques;
    }

    public void setBanques(Banque banques) {
        this.banques = banques;
    }

    public Set<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Set<Compte> comptes) {
        this.comptes = comptes;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
