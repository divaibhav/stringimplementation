# String Handling Practice
 *by Using String, StringBuilder and StringBuffer*
 
 1. WAP to print any given inputString in following format.
       
        Output
  
        index:  0    1   2   3   4   
        chars:  H    e   l   l   o
        
        Every character is seprated by tab, use "\t" for inserting tab.
   2. WAP to print substring of a given inputString by using ```String substring(int index)```. Accept inputString and index from user.
   
   3. WAP to accept inputString from user and replace all the vowels by *, by using ```String replace(char oldChar, char newChar)```.
     
            String s1 = "vaibhav";
            s1 = s1.replace('a','*');
            System.out.println(s1);
            
            output:
            v*ibh*v
   
   4. Modify the above program so that:
        1. first occurred vowel will be replaced by *.
        2. Second occurred vowel will be replaced by ^.
        3. Third occurred vowel will be replaced by !.
        
        repeat the above process for all occurred vowels.
   
   5. WAP to replace all the occurrence of given subString from the inputString. --- (**search library function for the task from the java docs** by using the link [https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/String.html]).
   
            enter a string
            hello123 world123 how123
            enter substring to be replaced by new string
            123
            enter new string
            456
            output:
            hello456 world456 how456
   
   6. WAP to change case of given inputString to uppercase by using ```String toUpperCase()```.
   
   7. WAP to print the totalWeight of given inputString.
            
            totalWeight can be calculate by adding *ASCII* value of all the characters.
                    for example:
                    inputString = "Abc";
                    totalWeight = 65 + 98 + 99;
                    
                    where ASCII values:
                        A --> 65
                        b --> 98
                        c --> 99
            
   8. WAP to print UpperWeight of given inputString. UpperWeight can be find by adding all the upper case characters of the inputString.
   
   9. WAP to print AbsoluteWeight of given inputString. Absolute weigth can be calulated as:
   
            absoluteWeight = UpperWeight - LowerWeight;
            
            1. absoluteWeight will always be a positive value.
            2. LowerWeight can be find by adding all the lower case characters of the inputString.
    
   10. WAP to print index of given character ch from inputString.
        
                input:
                char ch = 'a';
                String inputString = "vaibhav";
                   
                output:
                1        
   
   11. WAP to print all the index in newline of given character ch form the inputString.
   
            input:
            char ch = 'a';
            String inputString = "vaibhav";
   
            output:
            1
            5
            
   12. WAP to accept inputString1 and inputString2. And print the greater String as per the alphabetical order.
   
   13. WAP to created an object of StringBuilder/StringBuffer using the no-argument constructor. Use append function to append 16 characters. Print length and capacity after each append.
   
   14. Shyam wants to build program which will replace all the characters of given input string by space seprated underscore symbol.
   
            input:
            inputString = "Shyam";
            
            output:       _ _ _ _ _
   15. Shyam now wants to improve the above program and will replace all the underscores by the accepting characters from user.
            
            example:
            if user entered a character 'a',
            now shyan will replace 4th underscore by 'a', and display
            
            output: _ _ _ a _;
  
