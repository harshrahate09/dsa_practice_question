// second largest digit in number
import java.util.Scanner;
class Main{
    public static int secondLargest(int num){
        int large = 0;
        int temp = num;
        while(num!=0){
            int dig = num % 10;
            if(dig>large){
                large = dig;
            }
            num = num / 10;
        }
        

        int sec_large = 0;
        while(temp!=0){
            int dig = temp % 10;
            if(dig>sec_large && dig!=large){
                sec_large = dig;
            }
            temp = temp / 10;
        }
        return sec_large;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(secondLargest(num));
        sc.close();
    }
}