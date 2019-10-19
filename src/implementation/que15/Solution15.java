package implementation.que15;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String inputString = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        // appending "_" in StringBuilder object
        for (int i = 0; i < inputString.length(); i++) {
            sb.append('_');
        }
        // count a variable to count that all character filled
        int count = 0;
        //loop to repeat till all characters are entered
        while(count < sb.length()) {
            // a function to display desired output
            showString(sb);
            // to get character from user
            System.out.println("enter a character to  gusse the name");
            // a variable to store entered character, reading input by using Scanner, taking string input and taking a character from it
            char c = sc.next().charAt(0);
            // initializing index by -1
            int index = -1;

            do {
                // finding index of characters using findIndexOfChar static method
                index = findIndexOfChar(inputString, c, index + 1);
                if (index != -1) {
                    sb.replace(index, index + 1, "" + c);
                    count++;
                }

            } while (index != -1);
        }
        // a function to display desired output
        showString(sb);
    }

    // a function to find index of given char from the inputString, from given index
    public static int findIndexOfChar(String inputString,char c, int index) {
        int res = inputString.indexOf(c, index);

        return res;

    }
    // a function to display desired output
    public static void showString(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i) );
            if(i!=sb.length() - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
