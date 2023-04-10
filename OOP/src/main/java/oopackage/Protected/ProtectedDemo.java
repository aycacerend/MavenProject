package oopackage.Protected;

public class ProtectedDemo {
    private void privateMethod(){
        System.out.println("private");
    }
    public void publicMethod(){
        System.out.println("public");
    }
    protected void protectedMethod(){
        System.out.println("protected");
    }
    public static void main(String[] args){
        ProtectedDemo protectedDemo = new ProtectedDemo();
        protectedDemo.privateMethod();
        protectedDemo.protectedMethod();
        protectedDemo.publicMethod();

    }
}

