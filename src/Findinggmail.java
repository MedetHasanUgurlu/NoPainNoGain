import java.util.ArrayList;

public class Findinggmail {
    public static void main(String[] args) {

        String[] x = {"asdasd@gmail.com","sadasd@hotmail.com","asdasdasçq@yohoo.com","ugurlumedethasan@gmail.com"};
        for (String s:myFunc(x)) {
            System.out.println(s);

        }
    }
    public static String[] myFunc(String[] mails) {

        ArrayList<String> list = new ArrayList<>();




        int x = 0;
        for (int i = 0; i < mails.length; i++) {
            String[] s = mails[i].split("@");
            if(s[1].equals("gmail.com")){
                list.add(mails[i]);
                x++;

            }

        }

        String[] result = new String[x];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);

        }



        return result;

    }
}
