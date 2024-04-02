package BankAccount;

import java.util.Scanner;

public class Access_modifier {
   public Access_modifier() {
   }

   public static void main(String[] var0) {
      System.out.println("Welcome to password finder .... ");
      System.out.println("Please enter ur username : ");
      Bank_Account obj = new Bank_Account();
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      sc.close();

      if (str.equals("pratham216")) {
         obj.SetPassowrd("pratham098765");
      
         System.out.println("The password for " + str + " is : " + obj.getPassowrd());
      } else {
         System.out.println("Sorry! The passowrd for this username doesn't exist in our database..");
      }

   }
}

class Bank_Account {
   public String username;
   private String password;

   Bank_Account() {
   }

   public void SetPassowrd(String var1) {
      this.password = var1;
   }

   public String getPassowrd() {
      return this.password;
   }
}
