package Java101;

import java.util.ArrayList;

public class SubStrings {
    public static void main(String[] args) {

        findAllSubStrings("Medet").stream().forEach(System.out::println);

    }

    public static ArrayList<String> findAllSubStrings(String s){
        ArrayList<String> list = new ArrayList<>();
        int length = s.length();
        for(int i = 0;i<length;i++){
            for(int b = 1;b<=length-i;b++){
                list.add(s.substring(i,b+i));
            }

        }
        return list;

    }


}
