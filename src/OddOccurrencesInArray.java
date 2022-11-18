import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static void main(String[] args) {


        int[] ints = {9,3,9,3,9,7,9};
        System.out.println(solution(ints));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 2) {
                result = entry.getKey();
            }

        }

        return result;
    }
}
