// Armstrong Number  
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        while(num!=0){
            count++;
            num = num / 10;
        }
        num = temp;
        int sum = 0;

        while(num!=0){
            int dig = num % 10;
            sum = sum + (int) Math.pow(dig,count);
            num = num/10;
        }

        if(temp==sum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}