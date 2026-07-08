// perfect square number
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = (int) Math.sqrt(num );
        if(res*res == num){
            System.out.println("Perfect square num");
        }else{
            System.out.println("not perfect square num");

        }
        sc.close();
    }
}