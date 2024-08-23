public class labelledBreak {
    public static void main(String[] args) {
        
        outer:for(int i=1; i<=5; i++) {
            inner:for(int j=1; j<=5; j++) {
                if(i==3 && j>2) {
                    break outer;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
