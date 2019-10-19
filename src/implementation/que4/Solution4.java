package implementation.que4;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String inputString = sc.nextLine();

        char[] crr = inputString.toCharArray();
        int counter = 1;
        for (int i = 0; i < crr.length; i++) {
            if(isVowel(crr[i])){
                if(counter == 1){
                    crr[i] = '*';
                    counter++;
                }
                else if(counter == 2){
                    crr[i] = '^';
                    counter++;
                }
                else if(counter == 3){
                    crr[i] = '!';
                    counter = 1;
                }

            }

        }
        String outputString = new String(crr);
        System.out.println(outputString);
    }

    private static boolean isVowel(char c) {
        boolean  response = false;
        String vowels = "aeiou";
        int index = vowels.indexOf(c);
        if(index != -1){
            response = true;
        }
        return  response;
    }

}
