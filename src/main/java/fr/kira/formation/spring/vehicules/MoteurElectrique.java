package fr.kira.formation.spring.vehicules;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MoteurElectrique implements Moteur{
    public String getNom() {
        return "Moteur Electrique";
    }
}
