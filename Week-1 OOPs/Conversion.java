import java.util.*;
import java.io.*;
import java.lang.*;
class Conversion{
    public static int sumOfFirstTwoNumbers(ArrayList<Integer> list){
        int sum = 0;
        for(Integer i = 0 ; i <= 2 ; i++){
            sum += i; //Unboxing
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4); //autoboxing
        System.out.println("ArrayList: "+arrayList);

        int sumFirstTwo = sumOfFirstTwoNumbers(arrayList);
        System.out.println("Sum of first two Numbers : " + sumFirstTwo);
    }
}