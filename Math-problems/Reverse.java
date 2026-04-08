import java.util.*;

//input: 678
//output: 876
public class Reverse {
    public static void main(String args[]){
    Scanner obj= new Scanner(System.in);
    int n=obj.nextInt();

    int sum=0;
    while (n != 0){
        int last =n%10;        // number extraction
        sum = (sum*10) + last; // formula to reverse
        n/=10;                 // omitting the last number
    }
    System.out.print(sum);
    }
}
