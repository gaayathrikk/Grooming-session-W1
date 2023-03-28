package Strings;

import java.util.Scanner;

public class Vowels {

    public static int findVowels(String word, int left, int right){
        int count = 0;
        for (int i = left; i <= right; i++) {
            char a = word.charAt(i);
            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        System.out.println("Enter the range : ");
        int left = sc.nextInt(), right = sc.nextInt();
        System.out.println(findVowels(word,left,right));
    }
}
