package oopackage.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritanceMain {
    public static void main(String[] args){
        List<Animal> animalList = new ArrayList<>();
        Animal sokakKopegi = new Dog();
        Animal sokakKedisi = new Cat();
        Animal corgi = new Corgi();
        Animal golden = new Golden();
        Animal bird = new Bird();
        System.out.println(corgi instanceof Dog);
        System.out.println(golden instanceof Dog);
        System.out.println(animalType(sokakKedisi));
        System.out.println(animalType(sokakKopegi));
        System.out.println(animalType(corgi));
        System.out.println(animalType(golden));
        System.out.println(animalType(bird));
    }
    public static String animalType(Animal animal){
        String animalType = "";
        if(animal instanceof Dog){
            if(animal instanceof Corgi){
                animalType ="Corgi";
            }else if(animal instanceof Golden){
                animalType = "Golden";
            }else{
                animalType ="Sokak köpeği";
            }
        }else if(animal instanceof Cat){
            animalType = "Cat";

        }else{
            animalType ="NOT FOUND";

        }

        return animalType;
    }
}
