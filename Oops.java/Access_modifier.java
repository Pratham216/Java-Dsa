import java.util.Scanner;

public class Access_modifier{
    public static void main(String[] args) {
        // creating an object.
                
        System.out.println("Welcome to password finder .... ");

        Bank_Account obj = new Bank_Account();
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter ur username : ");
        String str =sc.nextLine();
        sc.close(); 

        obj.username = str;
        if(obj.username.equals("pratham216")){
            obj.SetPassowrd("098765");
             System.out.println("The password for "+ obj.username +" is : " + obj.getPassowrd());
        }
        else{
            System.out.println("Sorry! The passowrd for this username doesn't exist in our database..");
        }

    }
}

class Bank_Account{
    public String username;
    private String password;

    // to let user set their passowrd we must make a setter function.
    public void SetPassowrd(String newPass){
        password = newPass;
    }
    public String getPassowrd(){
       return password;
    }
}