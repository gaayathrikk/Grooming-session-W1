package Strings;

import java.util.Scanner;

public class LongestSubstring{
    public static int lengthOfLongestSubstring(String str){
        int maxLength = -1;
        String subString = "";

        if(str.length() == 0){
            return 0;
        }else if(str.length() == 1){
            return 1;
        }else{
            for(char c : str.toCharArray()){
                String charString = String.valueOf(c);
                if(subString.contains(charString)){
                    subString = subString.substring(subString.indexOf(charString)+1);
                }
    
                subString = subString + String.valueOf(c);
                maxLength = Math.max(subString.length(), maxLength);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(str));
    }
}