package oopackage.GetterSetter;


public class GetterSetterMain {
    public static void main(String[] args) {
        GetterSetterDemo getterSetterDemo = new GetterSetterDemo();
        getterSetterDemo.setName("Ayça Ceren");
        getterSetterDemo.setSurname("Dinçer");
        getterSetterDemo.setAge(23);
        getterSetterDemo.setCinsiyet(Cinsiyet.Kadın);
        getterSetterDemo.setActive(true);


        System.out.println(getterSetterDemo.getName() + " " + getterSetterDemo.getSurname() + getterSetterDemo.getAge() + getterSetterDemo.getCinsiyet() + getterSetterDemo.isActive());
        GetterSetterDemo getterSetterDemo1 = new GetterSetterDemo("Ayça", "Dinçer", 23, Cinsiyet.Kadın, true);
    }
}
