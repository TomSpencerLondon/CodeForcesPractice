package codeforces;

import java.util.Scanner;

public class Filename {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    String filename = scanner.nextLine();
    boolean groupOfTwo = false;
    int count = 0;
    int finalCount = 0;
    for(int i = 1; i < filename.length(); i++){
      if (filename.charAt(i) == 'x' && filename.charAt(i - 1) == 'x'){
        if (groupOfTwo) {
          count++;
        }
        groupOfTwo = true;
      }

      if (filename.charAt(i) != 'x' || i == filename.length() - 1){
        finalCount += count;
        count = 0;
        groupOfTwo = false;
      }
    }

    System.out.println(finalCount);
  }
}
