package oopackage.Inheritance;

public class Corgi extends Dog implements CorgiInterface{

    public Corgi(){
        super();
        System.out.println("Corgi");
    }
    public Corgi(String log,String age){
        super(log);
        System.out.println("corgi" + age);
    }
    @Override
    public void description() {
        System.out.println("Kraliçenin sevdiği köpek türüdür.");
    }
    public void Corgi(){
        System.out.println("Kuyruksuzdur.");
    }
}
