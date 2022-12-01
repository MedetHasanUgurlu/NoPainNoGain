package Java101;


public class ReverseNumber {
    public static void main(String[] args) {
        int x = 123456;
        String xString = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(xString);
        System.out.println(stringBuilder.reverse());




    }
}
