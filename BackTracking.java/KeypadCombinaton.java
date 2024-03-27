import java.util.Scanner;

public class KeypadCombinaton {
  public static void getCombinations(String keypad[], String str, String ans) {
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }

    String key = keypad[str.charAt(0) - 48];

    for (int i = 0; i < key.length(); i++) {
      getCombinations(keypad, str.substring(1), ans + key.charAt(i));
    }

  }

  public static void main(String[] args) {
    String keypad[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number :");
    String str = sc.nextLine();

    String ans = "";

    getCombinations(keypad, str, ans);
    /* */
  }
}
