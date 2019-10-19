package implementation.que3;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String inputString = sc.nextLine();
        String vowels = "aeiou";

        for (int i = 0; i < vowels.length(); i++) {
            inputString = inputString.replace(Character.toString(vowels.charAt(i)), "*");
        }


        System.out.println(inputString);
    }
}
