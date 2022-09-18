import java.util.Scanner;

public class doublyPrime {
    public static void main ( String[] args ){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count =0;
        int no_prime=0;
        for (int i=1;i<=n;i++){
            int d =2;
            for (d=2;d<i;d++){
            if (i%d==0){
                continue;
            }
        }
        no_prime++;



        
    }
    if (no_prime==2){
        count++;
    }

    System.out.println(count);
}
}