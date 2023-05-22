package fr.kira.formation.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan("fr.kira.formation.spring")
@Import(DemoConfiguration.class)
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        System.out.println(context.getBean( String.class));
        System.out.println(context.getBean("tailleMessage", Integer.class)); // 23
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        Voiture voiture = context.getBean("voitureElectrique", Voiture.class);
        voiture.rouler();
        System.out.println(voiture.getMoteur().getNom());

    }
}