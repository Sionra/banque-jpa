package fr.diginamic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Virement extends Operation{

    @Column(name = "BENEFICIAIRE")
    private String beneficiaire;

    public Virement(){}

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}
