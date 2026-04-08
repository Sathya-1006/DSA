import java.util.*;



public class PrintAllDivisors {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        List<Integer> lis = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                lis.add(i);
                if((n/i) != i){
                    lis.add((n/i));
                }
            }
        }

        Collections.sort(lis);
        for(int i:lis){
            System.out.print(i + " ");
        }

    }
}
