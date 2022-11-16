public class NumberOfDigit {
    public static void main(String[] args) {

        System.out.println(numberOfDigit(0));
    }
    public static int numberOfDigit(int i){
        String s =String.valueOf(i);

        if(i<0){
            return s.length()-1;
        }else if (i>0){
            return s.length();
        }else {
            return 1;
        }


    }

}

