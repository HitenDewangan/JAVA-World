public class p2_2 {
    public static void main(String[] args) {

        int n = 7;
        int inc1 = 2*n-3, inc2 = 2;
        for(int i=1; i<=n; i++){
            int temp = i;
            for(int j=1; j<=i; j++){
                System.out.print(temp+" ");
                
                if(j%2 != 0){
                    temp += inc1;
                }
                else if(i==j-1){
                    temp += 2;
                }
                else if(j>2){
                    temp += inc2-4;
                }
                else{
                    temp += inc2;
                }
            }
            System.out.println();
            inc1 -= 2; // inc1 = 
            if(i>=3){
                inc2 += 2;
            }
            
            
        }
    }
}
