package oopackage.Inheritance;

public class GoldenMain {
    public static void main (String[] args){
        Golden golden = new Golden();
        golden.bigger();
        golden.description2();
        Golden golden2 = new Golden("log","3");
        Dog dog = (Dog) golden2; // burda bu sekilde belirtildiği zaman sadece doga ait özellikleri corgi2 alabilir
        Dog dog2 = new Golden(); // bu da başka bir yöntemidir.
        dog2.Sound();
        golden.bigger();
        System.out.println(dog2 instanceof Golden); // köpek türü mü değil mi true false döner

    }
}
