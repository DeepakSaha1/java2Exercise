// 8. WAP to read words from the keyboard until the word "done" is entered.
// For each word except done, report whether its first character is equal
// to  its last character. For the required loop, use
// a)while statement
// b)do-while statement

import java.util.Scanner;

class CheckInputString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your words:");
        String word = s.next();

        while(!word.equals("Done")){
            if(word.charAt(0)== word.charAt(word.length()-1))
                System.out.println("First and last character are same in " +word);
            else
                System.out.println("First and last character are not same in " + word);
            word = s.next();
        }

 /*      do{
            if(word.charAt(0)== word.charAt(word.length()-1)){
                System.out.println("First and last character are same in " +word);
            }
            else{
                System.out.println("First and last character are not same in " + word);
            }
            word = s.next();
        }while(!word.equals("Done"));*/
    }
}
