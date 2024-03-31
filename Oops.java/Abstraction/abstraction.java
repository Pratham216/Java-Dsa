
public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eats();
        horse.walks();
        System.out.println(horse.color);

        Cheetah cheetah = new Cheetah();
        cheetah.eats();
        cheetah.walks();

        System.out.println("\n*************************");
        
        
        System.out.println("The hierarchy of the abstraction is :\n");
        // Mustang horse2 = new Mustang();
    }
}

 abstract class Animals{

    String color;

    Animals(){          /*The default constructor is made */
        color = "brown";
        System.out.println("Animal constructor is called");
    }

    void eats(){
        System.out.println("All animals eats.");
    }

    abstract void walks();

}

class Horse extends Animals{

    Horse(){
        System.out.println("Horse constructor is called ");
    }

    void changeColor(){
        color="white";
    }
    
    void walks(){
        System.out.println("Runs very fast.");
    }
}

class Mustang extends Horse{

    Mustang(){  
        System.out.println("Mustang constructor is called ");
    }
}
    

class Cheetah extends Animals{
    
    void changeColor(){
        color="yellow and black";
    }
    void walks(){
        System.out.println("The fastest animal.");
    }
}
