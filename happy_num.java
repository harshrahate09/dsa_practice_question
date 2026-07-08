// happy number
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>9){
            sum = 0;
            while(n!=0){
                int digit = n % 10;
                n = n / 10;
                sum = sum + digit * digit;
            }
            n = sum;
        }
        if(n==1){
            System.out.println("Happy Number");
        }else{
            System.out.println("Not Happy Number");

        }
        sc.close();
    }
}