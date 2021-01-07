package codeforces;

import java.util.Scanner;

public class Filename2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    String filename = scanner.nextLine();
    System.out.println(replace(filename));
  }

  public static String replace(String input){
    if (input.equals(input.replaceFirst("xxx", "xx"))){
      return input;
    }
    return replace(input.replaceFirst("xxx", "xx"));
  }
}
