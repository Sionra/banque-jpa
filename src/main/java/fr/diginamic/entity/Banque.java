package fr.diginamic.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Banque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "NOM")
    private String nom;
    @OneToMany(mappedBy = "banques")
    private Set<Client> clients;

    public Banque(){}

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

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }
}
