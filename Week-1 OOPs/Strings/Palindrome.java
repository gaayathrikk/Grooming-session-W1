package Strings;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int i = 0 , j = str.length()-1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        System.out.println(isPalindrome(word));
    }
}
