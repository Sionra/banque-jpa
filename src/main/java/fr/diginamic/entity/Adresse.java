package fr.diginamic.entity;

import jakarta.persistence.*;

@Embeddable
public class Adresse {

    @Column(name = "NUMERO")
    private int numero;
    @Column(name = "RUE")
    private String rue;
    @Column(name = "CODE_POSTAL")
    private int code_postal;
    @Column(name = "VILLE")
    private String ville;

    public Adresse(){}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(int code_postal) {
        this.code_postal = code_postal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
