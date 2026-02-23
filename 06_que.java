// Digit Frequency
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int dig = sc.nextInt();
        int count = 0;
        if(num==0){
            count++;
        }else{
            while(num!=0){
            int lastdig = num % 10;
            if(lastdig==dig){
                count++;
            }
            num = num / 10;
        }
        }
        System.out.print(count);
    }
}