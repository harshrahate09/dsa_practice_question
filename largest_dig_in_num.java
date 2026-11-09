// largest digit in number
import java.util.*;
class Main{

    public static int largestNumber(int num){
        int large = 0;
        while(num!=0){
            int dig = num % 10;
            if(dig>large){
                large = dig;
            }
            num = num / 10;
        }
        return large;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(largestNumber(num));
        sc.close(); 
    }
}