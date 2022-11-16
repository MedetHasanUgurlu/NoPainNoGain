import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("bbbb","aaaa"));
    }

    public static boolean isAnagram(String s1, String s2){

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        // Check Length
        if (s1.length() !=s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        System.out.println(c1);
        System.out.println(c2);
        for(char c: c1){
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            }else{
                map1.put(c,1);
            }

        }
        System.out.println(map1.entrySet());

        for(char c: c2){
            if(map2.containsKey(c)){
                map2.put(c,map2.get(c)+1);
            }else{
                map2.put(c,1);
            }

        }
        System.out.println(map2.entrySet());

        return map1.equals(map2);

    }
}
