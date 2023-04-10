package oopackage.Inheritance;

public class Cat extends Animal implements CatInterface , CatInterface2{

    public Cat(){
        super();
    }
    public void Sound(){
        super.Sound();
        System.out.println("Miyav");

    }

    @Override
    public void Move() {
        //super.Move();
        System.out.println("4 ayak üstünde yürür");
    }


    @Override
    public void dortAyakUstuneDusme() {

    }
    @Override
    public void dokuzCanliOlmak() {

    }
    @Override
    public void Purring() {

    }
}
