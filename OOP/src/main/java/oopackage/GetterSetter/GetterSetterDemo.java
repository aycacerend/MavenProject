package oopackage.GetterSetter;

import java.util.Locale;

public class GetterSetterDemo {
    private String name;
    private String surname;
    private int age;
    private boolean active;

    private Cinsiyet cinsiyet;

    public GetterSetterDemo(String name,String surname, int age, Cinsiyet cinsiyet,boolean active){
        this.name = name.toUpperCase(Locale.forLanguageTag("tr"));
        this.surname =surname.toUpperCase(Locale.forLanguageTag("tr"));
        this.age = age;
        this.cinsiyet = cinsiyet;
        this.active = active;

    }
    public GetterSetterDemo(){

    }

    public String getName(){
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge(){
        return age;
    }


    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public boolean isActive() {
        return active;
    }

    public void setName(String name) {
        this.name = name.toUpperCase(Locale.forLanguageTag("tr"));
    }
    public void setSurname(String surname) {
        this.surname = surname.toUpperCase(Locale.forLanguageTag("tr"));
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setCinsiyet(Cinsiyet cinsiyet){
        this.cinsiyet= cinsiyet;
    }


    public void setActive(boolean active) {
        this.active = active;
    }
}
