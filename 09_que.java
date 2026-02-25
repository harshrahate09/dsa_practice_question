// Difference between Even and Odd Digits Sum 
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
        int even_sum = 0;
        int odd_sum = 0;
        for(int i=0 ; i<=arr.length-1 ; i++){
            if(arr[i]%2==0){
                even_sum = even_sum + arr[i];
            }else{
                odd_sum = odd_sum + arr[i];
            }
        }
        int diff = Math.abs(even_sum - odd_sum) ;
        System.out.println(diff);
    }
}