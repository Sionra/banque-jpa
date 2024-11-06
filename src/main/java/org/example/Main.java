package org.example;

import fr.diginamic.entity.Adresse;
import fr.diginamic.entity.Banque;
import fr.diginamic.entity.Client;
import fr.diginamic.entity.Compte;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Banque b1 = new Banque();
        Client satan = new Client();
        Set<Client> temp = new HashSet<>();

        satan.setNom("Tan");
        satan.setPrenom("Sa");
        satan.setDate_de_naissance(LocalDateTime.parse("1986-04-08 12:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        satan.getAdresse().setCode_postal(00001);
        satan.getAdresse().setRue("Chemin de l'enfert");
        satan.getAdresse().setVille("FireCity");
        satan.getAdresse().setNumero(01);
//        satan.setBanques(b1);
//        satan.setAdresse(satan_adresse);

        b1.setNom("L'enfert");
        //b1.setClients(temp);


        //Open
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque-jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(b1);
        em.persist(satan);

        transaction.commit();
        em.close();
        emf.close();
    }
}