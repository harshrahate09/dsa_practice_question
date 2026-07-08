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
            int sumofodd = a + c ;
            int sumofeven = b + d ;
            if(sumofodd == sumofeven){
                System.out.println(1);
            }
            else{
                System.out.println(0);

            }
        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}