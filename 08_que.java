//  Sum of Even Digits  
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0 ; i<=arr.length-1 ; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0 ; i<=arr.length-1 ; i++){
            if(arr[i]%2==0){
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}