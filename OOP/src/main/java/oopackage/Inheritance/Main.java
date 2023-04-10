package oopackage.Inheritance;

public class Main {
    public static void main(String[] args){
        Cat cat= new Cat();
        cat.Move();
        cat.Sound();
        cat.Eat();
        //cat.protectedMethodDemo();
        Cat2 cat2 = new Cat2();
        cat2.Move();
        Dog dog = new Dog();
        dog.Bite();
        dog.Train();
        dog.Eat();
        Corgi corgi = new Corgi();
        corgi.Train();
        corgi.description();


    }
}
