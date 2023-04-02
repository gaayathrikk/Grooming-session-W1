package Strings;

public class CommonPrefix {
    public static String longestCommonPrefix(String[] strArray){
        int i = 0;
        String str1 = strArray[0] ,  str2 = strArray[strArray.length-1];
        
        while(i < str1.length() && i < str2.length()){
            if(str1.charAt(i) == str2.charAt(i)){
                i++;
            }else{
                break;
            }
        }

        return str1.substring(0,i);
    }
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
}
