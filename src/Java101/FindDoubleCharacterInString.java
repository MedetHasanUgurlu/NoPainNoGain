package Java101;

import java.util.HashMap;
import java.util.Map;

public class FindDoubleCharacterInString {
    public static void main(String[] args) {
        String s = "ABCCDR";
        System.out.println(findDouble(s));
    }

    public static String findDouble(String s){
        String result = "";
         char[] characters = s.toCharArray();
         Map<Character,Integer> map = new HashMap<>();
         for(char c : characters){
             if(map.containsKey(c)){
                 map.put(c,map.get(c)+1);
             }else {
                 map.put(c,1);
             }
         }

         for(Map.Entry<Character,Integer> entry : map.entrySet()){
             if(entry.getValue()== 2){
                result += entry.getKey().toString();
             }

         }
         return result;


    }

}
