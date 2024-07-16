import java.util.Scanner;

public class Add{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("sum is: " + a + b);
        System.out.println("sum is: " + (a + b));

        scan.close();

    }
}
