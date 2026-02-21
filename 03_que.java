// Palindrome Number 
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp!=0){
            int dig = temp % 10;
            rev = rev * 10 + dig;
            temp = temp / 10;
        }
        if(num==rev){
            System.out.println("True");
        }else {
            System.out.println("false");
        }
    }
}