package fr.kira.formation.spring.vehicules;

import org.springframework.beans.factory.annotation.Qualifier;

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
