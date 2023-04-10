package oopackage.Inheritance;

public class CorgiMain {
    public static void main(String[] args){
        Corgi corgi = new Corgi();
        corgi.description();
        corgi.Corgi();
        Corgi corgi2 = new Corgi("log","2");
        Dog dog = (Dog) corgi2; // burda bu sekilde belirtildiği zaman sadece doga ait özellikleri corgi2 alabilir
        Dog dog2 = new Corgi(); // bu da başka bir yöntemidir.
        dog2.Sound();
        System.out.println(dog2 instanceof Corgi); // köpek türü mü değil mi true false döner




    }
}
