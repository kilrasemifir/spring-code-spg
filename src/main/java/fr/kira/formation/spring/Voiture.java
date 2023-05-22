package fr.kira.formation.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class Voiture implements Vehicule{
    private String nom;
    private Moteur moteur;

    public Voiture(
            @Qualifier("nomVoiture") String nom,
            Moteur moteur
    ){
        this.nom = nom;
        this.moteur = moteur;
    }

    public void rouler() {
        System.out.println(this.nom+": Je roule");
    }

    public Moteur getMoteur() {
        return this.moteur;
    }
}
