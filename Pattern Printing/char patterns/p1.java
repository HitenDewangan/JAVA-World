public class p1 {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i=1; i<=5; i++) {
            for(int j=(5-i+1); j>=1; j--){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}
