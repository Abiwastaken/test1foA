import java.util.Scanner;
public class dm {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mul = 1;
   do {
    mul = (n % 10) * mul;
    n = n / 10;
   } while (n != 0);
        if (mul == 0) {
            System.out.println("0");
        } else {
            System.out.println(mul);


   }
    
       
    sc.close();
    

 }   
}
