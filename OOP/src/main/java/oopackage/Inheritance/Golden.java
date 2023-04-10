package oopackage.Inheritance;

public class Golden extends Dog implements GoldenInterface {
    public Golden(){
        super();
        System.out.println("Golden");
    }
    public Golden(String log,String age){
        super(log);
        System.out.println("golden" + age);
    }
    public void description2(){
        System.out.println("Benim en sevdiğim köpek türüdür.");
    }

    @Override
    public void despriction2() {

    }

    public void bigger(){
        System.out.println("50 kiloya kadar büyüyebilirler");
    }



}
