import java.util.Scanner;

class Division{
    int quotient(int a, int b){
        return a/b;
    }

    int remainder(int a, int b){
        return a%b;
    }
}


class Divide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the numerator: ");
        int num1 = scan.nextInt();

        System.out.println("Enter the denominator: ");
        int num2 = scan.nextInt();

        Division div = new Division();

        System.out.println("The quotient is: " + div.quotient(num1, num2));
        System.out.println("The remainder is: " + div.remainder(num1, num2));

    }
}
