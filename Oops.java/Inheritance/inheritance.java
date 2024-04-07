package Inheritance;

public class inheritance {
    public static void main(String[] args) {
        Whale bluWhale = new Whale();
        bluWhale.eat();
        bluWhale.breathe();
        bluWhale.size = "Enormus";
        System.out.println("Size of blue whale is : "+bluWhale.size);
        bluWhale.fins = true;
        System.out.println(bluWhale.fins);
        bluWhale.blood();

    }
}
// base class or parent class.

class Animal{
 
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
//Derived class or subclass or child class.
class Fish extends Animal{ 
    boolean fins;

    void gills(){
        System.out.println("gills present");
    }
}

class Whale extends Fish{
    String size;

    void blood(){
        System.out.println("Cold blooded ");
    }
}