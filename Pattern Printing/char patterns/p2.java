public class p2 {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            char ch = 65;
            for(int j=1; j<=(5-i+1); j++){
                System.out.print(" "+ch);
                ch++;
            }
            System.out.println();
        }

    }
}
