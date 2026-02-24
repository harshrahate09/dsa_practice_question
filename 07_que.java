// Largest Digit 
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int largest_dig = 0 ;
        while(num!=0){
            int dig = num % 10;
            if(dig>=largest_dig){
                largest_dig = dig;
            }
            num = num / 10;
        }
        System.out.print(largest_dig);
    }
}