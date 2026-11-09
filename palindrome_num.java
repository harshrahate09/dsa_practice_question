import java.util.Scanner;
class Main{

    public static boolean palindromeNumber(int n){
        int rev = 0;
        int temp = n;
        while(temp!=0){
            int dig = temp % 10;
            rev = rev * 10 + dig;
            temp = temp / 10;
        }
        return rev==n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(palindromeNumber(n)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    sc.close();
}