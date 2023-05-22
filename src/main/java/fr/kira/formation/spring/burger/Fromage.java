package fr.kira.formation.spring.burger;

import org.springframework.stereotype.Component;

@Component
public class Fromage implements Ingredient {
    @Override
    public String toString() {
        return "Fromage{}";
    }
}
