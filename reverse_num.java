// reverse the number
import java.util.Scanner;
class Main{

    public static int reverseNumber(int num){
        int rev = 0;
        while(num!=0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverseNumber(num));
        sc.close();
    }
}