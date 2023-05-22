package fr.kira.formation.spring;

import org.springframework.stereotype.Component;

@Component
public class MoteurThermique implements Moteur{
    public String getNom() {
        return "Moteur Thermique";
    }
}
