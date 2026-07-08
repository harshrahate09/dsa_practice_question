//find the third largest digit
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int largest = 0;
        while(num!=0){
            int digit = num % 10;
            if(digit > largest){
                largest = digit;
            }
            num = num / 10;
        }

        num = temp;
        int sec_largest = 0;
        while(num!=0){
            int digit = num % 10;
            if(digit > sec_largest && digit != largest){
                sec_largest = digit;
            }
            num = num / 10;
        }

        num = temp;
        int third_largest = 0;
        while(num!=0){
            int digit = num % 10;
            if(digit > third_largest && digit != largest && digit != sec_largest){
                third_largest = digit;
            }
            num = num / 10;
        }

        

        // System.out.println(largest);
        // System.out.println(sec_largest);
        System.out.println(third_largest);
        sc.close();
    }
}