import java.util.HashMap;
import java.util.Map;

public class BalancedWord {
    public static void main(String[] args) {
//		We can assign a value to each character in a word, based on their position in the alphabet (a = 1, b = 2, ... , z = 26).
//		A balanced word is one where the sum of values on the left-hand side of the word equals the sum of values on the right-hand side.
//		For odd length words, the middle character (balance point) is ignored.

//		Write a function that returns true if the word is balanced, and false if it's not.

//		Examples
//		balanced("zips") ➞ true
//		// "zips" = "zi|ps" = 26+9|16+19 = 35|35 = true
//
//		balanced("brake") ➞ false
//		// "brake" = "br|ke" = 2+18|11+5 = 20|16 = false
//		Notes
//		All words will be lowercase, and have a minimum of 2 characters.
//		Palindromic words will always be balanced.
        System.out.println(isBalanced("lol"));


    }

    static boolean isBalanced(String s) {
        Map<String, Integer> m = new HashMap<>();
        m.put("a", 1);
        m.put("b", 2);
        m.put("c", 3);
        m.put("d", 4);
        m.put("e", 5);
        m.put("f", 6);
        m.put("g", 7);
        m.put("h", 8);
        m.put("i", 9);
        m.put("j", 10);
        m.put("k", 11);
        m.put("l", 12);
        m.put("m", 13);
        m.put("n", 14);
        m.put("o", 15);
        m.put("p", 16);
        m.put("q", 17);
        m.put("r", 18);
        m.put("s", 19);
        m.put("t", 20);
        m.put("u", 21);
        m.put("v", 22);
        m.put("w", 23);
        m.put("x", 24);
        m.put("y", 25);
        m.put("z", 26);

        int leftSide = 0;
        int rightSide = 0;
        int length = s.length();

        if (length % 2 == 0) {
            for (int i = 0; i < (length / 2); i++) {
                char c = s.charAt(i);
                String sss = String.valueOf(c);
                int valueOfMap = m.get(sss);
                leftSide += valueOfMap;
            }
            for (int i = (length / 2); i < length; i++) {
                char c = s.charAt(i);
                String sss = String.valueOf(c);
                int valueOfMap = m.get(sss);
                rightSide += valueOfMap;
            }
        } else {
            for (int index = 0; index < length / 2; index++) {
                char left = s.charAt(index);
                String sp = String.valueOf(left);
                int sps = m.get(sp);
                leftSide += sps;
            }
            for (int index = length / 2 + 1; index < length; index++) {
                char right = s.charAt(index);
                String sp = String.valueOf(right);
                int sps = m.get(sp);
                rightSide += sps;
            }
        }
        return leftSide == rightSide;

    }
}
