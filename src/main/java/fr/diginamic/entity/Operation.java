package fr.diginamic.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "DATE")
    private LocalDateTime date;
    @Column(name = "MONTANT")
    private double montant;
    @Column(name = "MOTIF")
    private String motif;
    @ManyToOne
    @JoinColumn(name = "ID_COMPTE")
    private Compte compte;

    public Operation(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
}
