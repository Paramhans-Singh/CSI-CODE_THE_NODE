import java.util.Scanner;

public class dividesection {
    public static void main( String[] args) {
    
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b= s.nextInt();
        int k = s.nextInt();
        int input[]= new int[n];
        for (int i=0;i<n;i++){
            input[i]=s.nextInt();
        }
        int j =1;
        for ( int i=0;i<n;i++){
            for (j=1;j<n;j++){
                int ans = k*input[j];
        if (input[i]==ans){
         
        }
        
    }
}
}
}