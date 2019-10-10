package implementation.que1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("enter a string");

        String inputString = sc.nextLine();

        System.out.print("Index:\t");

        for (int i = 0; i < inputString.length() ; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("chars:\t");
        for (int i = 0; i < inputString.length() ; i++) {
            char c = inputString.charAt(i);
            System.out.print(c + "\t");
        }

    }
}
