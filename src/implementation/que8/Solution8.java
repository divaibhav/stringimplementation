package implementation.que8;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String inputString = sc.nextLine();
        int upperWeight = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char charFromInputSting = inputString.charAt(i);
            if(Character.isUpperCase(charFromInputSting)){
                upperWeight = upperWeight + charFromInputSting;
            }
        }
        System.out.println("Upper Weight = " + upperWeight);
    }
}
