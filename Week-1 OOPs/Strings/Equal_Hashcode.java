package Strings;

public class Equal_Hashcode {
    public static void main(String[] args) {
        String a = "Same";
        String a1 = "Same";
        String b = "Different";

        if(a.equals(a1)){
            System.out.println("a and b are equal");
        }else{
            System.out.println("a and b are not equal");
        }

        int x = a.hashCode();
        int x1 = a1.hashCode();
        System.out.println(x + " and " + x1);
    }
}
