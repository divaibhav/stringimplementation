package implementation.que14;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String inputString = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            sb.append("_");
        }
        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i) );
            if(i!=sb.length() - 1){
                System.out.print(" ");
            }
        }
    }
}
