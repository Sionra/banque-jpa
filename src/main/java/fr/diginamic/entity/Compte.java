package fr.diginamic.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "SOLDE")
    private double solde;
    @ManyToMany(mappedBy = "comptes")
    private Set<Client> clients;
    @OneToMany(mappedBy = "compte")
    private Set<Operation> operations;

    public Compte(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }
}
