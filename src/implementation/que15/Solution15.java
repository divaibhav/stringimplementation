package implementation.que15;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String inputString = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            sb.append('_');
        }

        //showString(sb);
        int count = 0;
        while(count < sb.length()) {
            showString(sb);
            System.out.println("enter a character to  gusse the name");
            char c = sc.next().charAt(0);
            int index = -1;

            do {
                index = findIndexOfChar(inputString, c, index + 1);
                if (index != -1) {
                    sb.replace(index, index + 1, "" + c);
                    count++;
                }

            } while (index != -1);
        }
        showString(sb);
    }

    public static int findIndexOfChar(String inputString,char c, int index) {
        int res = inputString.indexOf(c, index);

        return res;

    }

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
