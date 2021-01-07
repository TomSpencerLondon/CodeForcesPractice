package codeforces;

import java.util.Scanner;

public class HolidayOfEquality {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int[] burles = new int[number];
    for (int i = 0; i < burles.length; i++){
      burles[i] = scanner.nextInt();
    }

    int max = 0;
    for (int i = 0; i < burles.length; i++){
      int temporary = burles[i];
      if (temporary > max){
        max = temporary;
      }
    }
    int spend = 0;
    for (int i = 0; i < burles.length; i++){
      spend += max - burles[i];
    }

    System.out.println(spend);
  }
}
