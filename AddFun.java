class Calculator{
    int res;
    int add(int a, int b){
        res = a+b;
        return 100 & res;
    }

    int sub(int a, int b){
        res = a-b;
        return res;
    }
}

public class AddFun {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 7;
        int b = 9;

        int sum = calc.add(a, b);
        

        System.out.println(calc.res);
        System.out.println(sum);
    }
}
