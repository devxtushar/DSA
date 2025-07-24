package strings;

import java.util.Scanner;

public class stringBasics {

    public static void printChar(String chars) {
        for (int i = 0; i < chars.length(); i++) {
            System.out.println("characters are : " + chars.charAt(i));
        }
    }

    public static void palindrome(String chars) {
        boolean check = true;
        for (int i = 0; i < (chars.length() / 2); i++) {
            if (chars.charAt(i) != chars.charAt(chars.length() - i - 1)) {
                check = false;
            }

        }
        System.out.println("palindrome : " + check);

    }

    public static void main(String[] args) {
        // String ex = "hi";
        // String ex2 = new String("xyz");

        // System.out.println("strings are there "+ex+ " " + ex2);

        // Scanner sc = new Scanner(System.in);
        Scanner multisc = new Scanner(System.in);
        String single, multi;
        // single = sc.next(); // for single input
        multi = multisc.nextLine(); // for multi input

        // System.out.println("single :"+ single+ " multi : "+multi + " length :" +
        // single.length()
        // ); // in strings class length is a fn

        // print characters
        // printChar(multi);
        palindrome(multi);

    }
}
