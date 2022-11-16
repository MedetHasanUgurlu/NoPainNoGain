import java.util.ArrayList;

public class aminusb {
    public static void main(String[] args) {
        System.out.println(findDifference("ABAAAA"));
        ArrayList list = new ArrayList();

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
