package Java101;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong2(152));


    }

    public static boolean isArmstrong2(int n){
        int count = 0;
        String s = String.valueOf(n);
        int len = s.length();
        int temp = n;
        for(int i= 0;i<len;i++){
            count += Math.pow(temp%10,len);
            temp /=10;
        }

        return count == n;
    }
    public static boolean isArmstrong(int n){

        String s = String.valueOf(n);
        int uzunluk = s.length();
        int count = 0;
        int temp = n;
        for(int i=0;i<uzunluk;i++){
            count += Math.pow(temp%10,uzunluk);

            System.out.println(count);

            temp/=10;
        }
        if(count ==n){
        return true;
        }
        return false;


    }
}
