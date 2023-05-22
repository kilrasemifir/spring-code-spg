package fr.kira.formation.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
@Primary
public class Voiture implements Vehicule{
    private String nom;

    public Voiture() {
    }

    @Autowired
    public Voiture(@Qualifier("nomVoiture") String nom){
        this.nom = nom;
    }

    public void rouler() {
        System.out.println(this.nom+": Je roule");
    }
}
