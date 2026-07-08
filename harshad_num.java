// harshad number
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num!=0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        if(temp%sum==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not Harshad Number");
        }
        sc.close();
    }
}