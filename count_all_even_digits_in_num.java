//count_all_even_digits_in_number
import java.util.Scanner;
class Main{
    public static int countEvenDigits(int n){
        int count = 0;
        while(n!=0){
            if(n%2==0){
              count++;
            }
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countEvenDigits(n));
        sc.close();
    }
}