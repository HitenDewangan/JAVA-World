public class p2_2 {
    public static void main(String[] args) {

        int inc1 = 11, inc2 = 2;
        for(int i=1; i<=6; i++){
            int temp = i;
            for(int j=1; j<=i; j++){
                System.out.print(temp+" ");
                if(j%2 != 0){
                    temp += inc1;
                }
                else{
                    temp += inc2;
                }
            }
            System.out.println();
            inc1 -= 2;
            if(i>=3){
                if(i%2 == 0){
                    inc2 = 2;  
                }
            }
            else if(i%2 == 0){
                inc2 = 2;
            }
            
        }
    }
}
