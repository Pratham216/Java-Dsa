package Polymorphism;

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator calc= new Calculator();
        System.out.println(calc.sum(10, 33));
        System.out.println(calc.sum(45.89f, 34.45f));
        System.out.println(calc.sum(23,34,58));
    }
}
class Calculator{
    int sum(int a , int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}