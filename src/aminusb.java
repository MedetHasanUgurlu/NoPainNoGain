import java.util.*;
import java.util.stream.Collectors;


public class aminusb {
    public static void main(String[] args) {
        System.out.println(findDifference2("ABAAAA"));


        Integer[] ints = {1,85,44,1256,12,7};

        //Arrays.sort(ints);
        List<Integer> list = List.of(ints).stream().collect(Collectors.toList());

        list.stream().sorted();
        int y = list.get(list.size()-1);
        System.out.println(y);
        list.stream().forEach(System.out::println);
        int[] ints2 = list.stream().mapToInt(x->x).toArray();
        Arrays.asList(list);





    }

    public static int findDifference2(String str) {
        char[] chars = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(char c: chars){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int result =  (int)map.values().toArray()[0]-(int)map.values().toArray()[1];
        return Math.abs(result);
    }

    public static int findDifference(String str) {

        int a = 0;
        int b= 0;
        // Insert your code here
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if(c=='A'){
                a++;

            }else{
                b++;
            }

        }
        return Math.abs(a-b);


    }
}
