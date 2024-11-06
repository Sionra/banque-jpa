package org.example;

import fr.diginamic.entity.*;
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
        Client john = new Client();
        Set<Compte> temp = new HashSet<>();
        Compte c1 = new Compte();
        LivretA a1 = new LivretA();
        AssuranceVie av1 = new AssuranceVie();
        Operation operation = new Operation();
        Virement virement = new Virement();

        satan.setNom("Tan");
        satan.setPrenom("Sa");
        satan.setDate_de_naissance(LocalDateTime.parse("1986-04-08 12:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        satan.getAdresse().setCode_postal(00001);
        satan.getAdresse().setRue("Chemin de l'enfert");
        satan.getAdresse().setVille("FireCity");
        satan.getAdresse().setNumero(01);
//        satan.setBanques(b1);
//        satan.setAdresse(satan_adresse);

        john.setNom("Doe");
        john.setPrenom("John");
        john.setDate_de_naissance(LocalDateTime.parse("1986-07-08 12:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        john.getAdresse().setCode_postal(00001);
        john.getAdresse().setRue("Chemin du neutre");
        john.getAdresse().setVille("NeutreCity");
        john.getAdresse().setNumero(01);

        b1.setNom("L'enfert");
        //b1.setClients(temp);

        c1.setNumero("666");
        c1.setSolde(666.66);

        a1.setTaux(2.66);
        a1.setSolde(1000);
        a1.setNumero("6666");
        av1.setTaux(1.21);
        av1.setDateFin(LocalDateTime.parse("2000-07-08 12:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        av1.setSolde(10001);
        av1.setNumero("777");
        temp.add(c1);
        temp.add(a1);
        temp.add(av1);

        operation.setDate(LocalDateTime.parse("2000-01-07 16:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        operation.setMontant(100);
        operation.setMotif("Envie de sang");
        virement.setBeneficiaire("Satan");
        virement.setDate(LocalDateTime.parse("2000-01-08 10:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        virement.setMontant(10);
        virement.setMotif("Envie de dix");
        operation.setCompte(c1);
        operation.setCompte(a1);

        satan.setComptes(temp);
        john.setComptes(temp);

        //Open
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque-jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(b1);
        em.persist(satan);
        em.persist(c1);
        em.persist(a1);
        em.persist(av1);
        em.persist(operation);
        em.persist(virement);

        transaction.commit();

        em.close();
        emf.close();
    }
}