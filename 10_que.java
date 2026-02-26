// // Digits in Ascending Order
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] count = new int[10];
        while(num!=0){
            int dig = num % 10;
            count[dig]++;
            num = num / 10;
        }
        int result = 0;
        for(int i=0 ; i<=9 ; i++){
            while(count[i] > 0){
                result = result * 10 + i;
                count[i]--;
            }
        }
        System.out.println(result);
    }
}