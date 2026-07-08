//find the largest digit
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int largest = 0;
        while(num!=0){
            int digit = num % 10;
            if(digit > largest){
                largest = digit;
            }
            num = num / 10;
        }
        System.out.println(largest);
        sc.close();
    }
}