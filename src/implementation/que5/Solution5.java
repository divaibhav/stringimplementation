package implementation.que5;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String inputString = sc.nextLine();
        System.out.println("enter substring to be replaced by new string");
        String subString = sc.nextLine();
        System.out.println("enter new string");
        String newString = sc.nextLine();

        inputString = inputString.replaceAll(subString, newString);
        System.out.println(inputString);

    }
}
