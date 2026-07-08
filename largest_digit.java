// largest of digit
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>999 && n<=9999){
            int a = n % 10;
            int b = n / 10 % 10;
            int c = n / 100 % 10;
            int d = n / 1000;
            
            int largestDigit = Math.max(a, Math.max(b ,Math.max(c , d)));
            System.out.println(largestDigit);
        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}