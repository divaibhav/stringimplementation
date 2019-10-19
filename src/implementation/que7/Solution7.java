package implementation.que7;
import java.util.Scanner;
public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String inputString = sc.nextLine();
        int totalWeigth = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char charFromInputString = inputString.charAt(i);
            totalWeigth = totalWeigth + charFromInputString;
        }

       System.out.println("total weigth = " + totalWeigth);
    }
}
