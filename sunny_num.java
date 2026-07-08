// sunny number 
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = (int) Math.sqrt(num + 1);
        if(res*res == num + 1){
            System.out.println("Sunny num");
        }else{
            System.out.println("not Sunny num");

        }
        sc.close();
    }
}