//remove number
import java.util.Scanner;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int remove = sc.nextInt();

        String str = Integer.toString(num);
        String removeDigit = Integer.toString(remove);

        str = str.replace(removeDigit ,"");
        int ans = Integer.parseInt(str);

        System.out.println(ans);
        sc.close();
    }
}