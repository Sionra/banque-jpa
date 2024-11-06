package fr.diginamic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class AssuranceVie extends Compte{

    @Column(name = "DATE_FIN")
    private LocalDateTime dateFin;
    @Column(name = "TAUX")
    private double taux;

    public AssuranceVie(){}

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
