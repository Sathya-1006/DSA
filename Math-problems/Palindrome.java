import java.util.*;

public class Palindrome {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n= obj.nextInt();
        int temp=n;
        int sum=0;
        while(n != 0){
            int last= n%10;
            sum = (sum * 10) + last;
            n/=10;
        }
        if(temp == sum){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}
