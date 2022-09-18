import java.util.Scanner;

public class prime {
    public static boolean isPrime(int number){
        if (number < 2)
        return false;
 
        for(int i=2; i<number; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true; }

     
    public static void main ( String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int count =0;
      for (int i=2;i<n;i++)
      {
          if(isPrime(i))
          {
              count++;
          }
      }
      System.out.println(count);


}
}

    
