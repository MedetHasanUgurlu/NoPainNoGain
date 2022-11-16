public class StringSwap {
    public static void main(String[] args) {

    }
    public String swapCharacters(String str) {

        // Insert your code here
        char[] x = str.toCharArray();
        char y = x[0];
        x[0] = x[str.length()-1];
        x[str.length()-1] = x[0];


        return null;


    }
}
