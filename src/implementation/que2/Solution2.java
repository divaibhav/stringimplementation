package implementation.que2;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string");

        String inputString = sc.nextLine();
        System.out.println("enter an index for substring");
        int beginIndex = sc.nextInt();

        String subString = inputString.substring(beginIndex);

        System.out.println(subString);
    }
}
