package fr.diginamic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class LivretA extends Compte{

    @Column(name = "TAUX")
    private double taux;

    public LivretA(){}

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
