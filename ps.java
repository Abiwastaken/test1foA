import java.util.Scanner;
public class ps {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean a = false;
        for (int i = 0; i < n; i++) {
        int x = i*i;
        if (x == n) {
            a = true;
            break;
    
        }

    }
    if (a) {
        System.out.println("Perfect Square");
    } else {
        System.out.println("not perfect square");
    }
}
}