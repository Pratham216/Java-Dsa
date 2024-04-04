package GetterSetter;

import java.util.Scanner;

public class Getter_Setter {
    public static void main(String[] args) {
        
        Pen obj = new Pen();
        obj.SetColor("Blue");
        System.out.println("The default colour is : "+obj.GetColor());

        System.out.println(" please enter any color : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        obj.SetColor(str);
        System.out.println("The changed colour is : "+ obj.GetColor());


        obj.SetTip(10);
        System.out.println("The default tip size is : "+obj.GetTipsize());

        obj.SetTip(345);
        System.out.println("The changed colour is : "+ obj.GetTipsize());


    }
}

class Pen{
    private String color;
    private int tipsize;

    public void SetColor(String newColor){
        this.color = newColor;
    }

    public String GetColor(){
        return this.color;
    }

    public void SetTip(int tipsize){
        this.tipsize = tipsize;
     /*  this.tipsize refers to above private int tipsize and it is pointing to this and only this tipsize
     and after equals to the tipsize is the one in the paramters. */
    }

    public int GetTipsize(){
        return this.tipsize;
    }
}

