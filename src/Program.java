import java.util.HashMap;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

foo("Hi Hello");

    }
  static void foo(String inputString){
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

      }
  }
}
