import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        getInput();
        printletters("pratham bisht");
    }
    public static void getInput(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string..");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Your string is : "+str);
    }
    public static void printletters(String str){
        for(int i =0; i<=str.length()-1; i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
}

