package Strings;

public class CompareTo {
    public static void main(String[] args) {
        String s1 = "same";
        String s2 = "";
        String s3 = "same";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(Integer.compare(14, 13));
        System.out.println(Integer.compare(4, 9));
        System.out.println(Integer.compare(6, 6));
    }
}
