package fr.kira.formation.spring.burger;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Burger {
    private List<Ingredient> ingredients = new ArrayList<>();

    public Burger(Pain pain, Steak steak, Fromage fromage, Salade salade) {
        this.ingredients.add(pain);
        this.ingredients.add(steak);
        this.ingredients.add(fromage);
        this.ingredients.add(salade);
    }

    @Override
    public String toString() {
        return "Burger{" +
                "ingredients=" + ingredients +
                '}';
    }
}
