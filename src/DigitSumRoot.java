public class DigitSumRoot {
    public static void main(String[] args) {
//		Create a function that takes a number and returns one digit that is the result of summing all the digits of the input number.
//		When the sum of the digits consists of more than one digit, repeat summing until you get one digit.

//		Examples
//		digitRoot(123) ➞ 6
//		// 1 + 2 + 3 = 6
//
//		digitRoot(999888777L) ➞ 9
//
//		digitRoot(1238763636555555555L) ➞ 9
//		Notes
//		Recursion is allowed.
        System.out.println(digitSumRoot(999888777L));
    }
    public static int digitSumRoot2(int n){
        int result =0;
        int length= String.valueOf(n).length();


            for(int i=0;i<length;i++){
                result += n%10;
                n/=10;
            }
            if(result>10){
                digitSumRoot2(result);
            }


        return result;

    }












    static int digitSumRoot(Long x){
        int len = String.valueOf(x).length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += x %10;
            x /=10;
        }
        if(sum>10){
            digitSumRoot((long)sum);
        }
        return sum;


        }



}
