import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        ;
        System.out.println(foo2("Hi Hello"));

    }

    public static String foo2(String s){
        String result ="";
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(Character c:chars){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>=2){
                result  +=entry.getKey().toString();
            }

        }
        return result;

    }

    public static String foo(String s) {


        String result = "";
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Set<Character> keys = map.keySet();
        for (Character c : keys) {
            if (map.get(c) >= 2) {
                result += c;
            }


        }
        return result;
    }
}


        /*
      HashMap<Character,Integer> charMap = new HashMap<>();
      char[] strArray = inputString.toCharArray();
      for(char c: strArray){
          if (charMap.containsKey(c)){
              charMap.put(c,charMap.get(c)+1);
          }else{
              charMap.put(c,1);
          }

      }
      Set<Character> charIntString = charMap.keySet();
      for(Character ch: charIntString){
          if (charMap.get(ch)>1){
              System.out.println(ch+" :" +charMap.get(ch));
          }

      }*/

