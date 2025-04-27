import java.util.Scanner;
public class dm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;
        boolean containsZero = false;

        do {
            int digit = n % 10;
            if (digit == 0) {
                containsZero = true;
                break;
            }
            mul *= digit;
            n /= 10;
        } while (n != 0);

        if (containsZero) {
            System.out.println("0");
        } else {
            System.out.println(mul);
        }

        sc.close();
    }
}
