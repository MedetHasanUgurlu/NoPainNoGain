import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {

        System.out.println(findDublicateCharacters("Medet"));

    }

    public static String findDublicateCharacters(String s){
        String result = "";
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for (char c: chars) {


            if (map.containsKey(c)) {
                map.put(c,map.get(c)+1);

            }else{
                map.put(c,1);
            }


        }

        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {

            if (entry.getValue() > 1) {
                result += entry.getKey();

            }
        }
        return result;

    }
}
