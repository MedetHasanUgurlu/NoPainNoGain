public class MultiplicativePersistence {
    public static void main(String[] args) {

        System.out.println(multiplicativePersistence(99));
    }

    public static int multiplicativePersistence(int n) {

        String s = String.valueOf(n);
        int l = s.length();
        int result = 1;

            for (int i = 0; i < l; i++) {

                result *= n % 10;
                n /= 10;


            }
            if (result > 10) {
                multiplicativePersistence(result);
            }


        return result;

    }

}

