package oopackage.Inheritance;

public abstract class AbstractClassDemo {

    public AbstractClassDemo() {

    }

    public void Eat() {
        System.out.println("Can eat");

    }

    public void Sleep() {
        System.out.println("Can sleep");
    }

    public void Move() {
        System.out.println("Can move");
    }

    public void Sound() {
        System.out.println("Can sound");
    }

    private void privateMethodDemo() {
        System.out.println("Private method in");
    }

    protected void protectedMethodDemo() {
        System.out.println("Protected method in");
    }
}


