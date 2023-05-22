package fr.kira.formation.spring.burger;

import org.springframework.stereotype.Component;

@Component
public class Salade implements Ingredient {

    @Override
    public String toString() {
        return "Salade{}";
    }
}
