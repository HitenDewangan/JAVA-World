public class p4 {
    public static void main(String[] args) {

        char ch = 'E';
        for(int i=1; i<=5; i++){
            for(int j=1; j<=(5-i+1); j++){
                System.out.print(" "+ch);
                ch--;
            }
            System.out.println();
            ch = (char)('E' - i);
        }

    }
}
