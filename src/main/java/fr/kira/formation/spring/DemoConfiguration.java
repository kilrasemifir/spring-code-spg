package fr.kira.formation.spring;

import fr.kira.formation.spring.vehicules.Moteur;
import fr.kira.formation.spring.vehicules.Voiture;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration // Indique à spring que cette classe est une classe de configuration.
public class DemoConfiguration {
    @Bean // Dit à spring d'ajouter le retour de cette mtd dans le context.
    public String hello(){
        System.out.println("hello");
        return "Hello World!!!";
    }

    @Bean
    public String hello2(){
        System.out.println("hello2");
        return "Hello 2";
    }

    @Bean
    public String nomVoiture(){
        return "Ma voiture";
    }

    @Bean
    @Primary // Demande à spring de prendre cette mtd en priorité.
    public String message(@Qualifier("hello") String content){
        System.out.println("message");
        return "Message: "+ content;
    }

    @Bean
    public Integer monEntier(){
        System.out.println("monEntier");
        return 17;
    }

    @Bean
    public Integer tailleMessage(String message){
        System.out.println("tailleMessage");
        return message.length();
    }

//    @Bean
//    public Voiture voiture(){
//        return new Voiture();
//    }

    @Bean
    public Voiture voitureThermique(
            @Qualifier("moteurThermique") Moteur moteur
    ){
        return new Voiture("Voiture thermique", moteur);
    }

    @Bean
    public Voiture voitureElectrique(
            @Qualifier("moteurElectrique") Moteur moteur
    ){
        return new Voiture("Voiture electrique", moteur);
    }
}
