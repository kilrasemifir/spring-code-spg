package fr.kira.formation.spring.burger;

import org.springframework.stereotype.Component;

@Component
public class Pain implements Ingredient{

    @Override
    public String toString() {
        return "Pain{}";
    }
}
