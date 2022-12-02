package Java101;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.

        ArrayList<Integer> list = new ArrayList<>();



    }

    public static String reverseString(String s){
        int length = s.length();
        String result = "";
        for(int i = length-1;i>=0;i--){
            result += s.charAt(i);
        }
        return result;

    }



}
