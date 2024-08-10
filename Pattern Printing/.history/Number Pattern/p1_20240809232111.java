public class p1 {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            int count = 1;
            for(int k=1; k<=(5-i+1); k++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j <= i){
                    System.out.print(count);
                    count++;
                }
                else if()
                else if(j>i){
                    count--;
                    System.out.print(count);
                }
            }
            System.out.println();

        }
    }
}
