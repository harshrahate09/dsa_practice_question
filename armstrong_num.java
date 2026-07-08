// armstrong number
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int arm = 0;
        int temp = num;
        while(num!=0){
            count++;
            num = num / 10;
        }

        num = temp;
        while(num!=0){
            int digit = num % 10;
            arm = arm + (int) Math.pow(digit , count);
            num = num / 10;
        }

        if(arm==temp){
            System.out.println("Armstrong num.");
        }else{
            System.out.println("Not Armstrong num.");

        }
        sc.close();
    }
}