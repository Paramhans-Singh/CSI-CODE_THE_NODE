
// https://www.hackerrank.com/code-the-node              -------> LINK OF CONTEST - I
// https://www.hackerrank.com/codethenode-1              -------> LINK OF CONTEST - II


import java.util.Scanner;

public class climbingMountains{
    public static void main( String[] args){
 Scanner s = new Scanner(System.in);
 int size= s.nextInt();
 int input[] = new int [size];
 for ( int i=0; i<size;i++){
    input[i]=s.nextInt();
 }

 int sum=0;
 sum = sum +input[0];
 for ( int a=0; a+1<size;a++){
    if ( input[a+1]<input[a]){
        continue;
    }
    sum=sum+input[a+1]-input[a];
 }
 System.out.println( sum); 
    }
}