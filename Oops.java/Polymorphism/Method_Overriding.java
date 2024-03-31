package Polymorphism;

public class Method_Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.Eats();
    }
}
class Animal{
    void Eats(){
        System.out.println("Eats both veg and non veg.");
    }
}
class Deer{
    void Eats(){
        System.out.println("Eats only grass.");
    }
}
