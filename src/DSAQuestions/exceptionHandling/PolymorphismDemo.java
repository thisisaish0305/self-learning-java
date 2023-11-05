package DSAQuestions.exceptionHandling;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.printHello();

        child c = new child();
        c.printHello("Tanner");

        Parent p2 = new child();
        p2.printHello();// run time polymorphism in play
        //child c2 = new Parent(); error
    }
}

class Parent {
    public void printHello(){
        System.out.println("Parent class: Hello");
    }
}

class child extends Parent{
    public void printHello(String user){
        System.out.println("child class: Hello "+ user);
    }

    public void printHello(){
        System.out.println("child class: Hello ");
    }
}


