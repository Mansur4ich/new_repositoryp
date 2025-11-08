import java.util.Scanner;
import java.util.Arrays;
public class m3 {
    public static int   sum(int n){
       if(n<10){
        return n;
       }
       else{
        return n%10+sum(n/10);
       }
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(sum(n));
    

   }
}