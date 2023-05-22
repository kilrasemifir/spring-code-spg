package fr.kira.formation.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Camion implements Vehicule{

    private String nom;

    public Camion() {
    }

    public Camion(String nom) {
        this.nom = nom;
    }

    public void rouler() {
        System.out.println(this.nom+": Je roule");
    }
}
