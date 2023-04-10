package oopackage.Inheritance;

public class Dog extends Animal implements DogInterface,DogInterface2{
    public Dog(){
        System.out.println("Hav hav hav");
    }
    public Dog(String log){
        System.out.println("dog" + log);
    }
    @Override
    public void Sound() {
        super.Sound();
        System.out.println("Hav hav");
    }

    @Override
    public void Bite() {
        System.out.println("Can bite");
    }

    @Override
    public void Train() {
        System.out.println("Can train");

    }
}
