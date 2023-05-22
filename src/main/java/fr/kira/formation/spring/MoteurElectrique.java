package fr.kira.formation.spring;

import org.springframework.stereotype.Component;

@Component
public class MoteurElectrique implements Moteur{
    public String getNom() {
        return "Moteur Electrique";
    }
}
