public class p2_2 {
    public static void main(String[] args) {

        int n = 10;
        int inc1 = 2*n-3+2, inc2 = 2;
        for(int i=1; i<=n; i++){
            int temp = i;
            for(int j=1; j<=i; j++){
                System.out.print(temp+"   ");
                
                if(j%2 != 0){
                    temp += inc1;
                }
                else{
                    temp += 2*(i-j);
                }
            }
            inc1 -= 2; // inc1 = 11, 7, 9, 5, 3, 1 ...
            System.out.println();
            
            
            
        }
    }
}
