package codeforces;

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String possible = scanner.nextLine();
    int count = 0;
    for (int i = 0, j = possible.length() - 1; i < j; i++, j--){
      if (possible.charAt(i) != possible.charAt(j)){
        count++;
      }
    }

    if (count == 1 || possible.length() == 1){
      System.out.println("YES");
    }else {
      System.out.println("NO");
    }
  }
}
