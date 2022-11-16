public class CountWords {
    public static void main(String[] args) {

        System.out.println(countWords("Just an example here move along"));
    }
    public static int countWords(String s){
        String[] strings = s.split(" ");
        return strings.length;

    }
}
