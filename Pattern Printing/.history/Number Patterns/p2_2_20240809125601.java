public class p2_2 {
    public static void main(String[] args) {

        int inc1 = 11, inc2 = 2;
        for(int i=1; i<=7; i++){
            if(i==3){
                inc1 = 3;
            }
            if(i < 4){
                inc1 = 2;
            }
            else if(i > 3){
                inc1 = i + i%2 + 1;
            }
            int temp = i;
            for(int j=1; j<=i; j++){
                System.out.print(temp+" ");
                if(j%2 != 0){
                    temp += inc1;
                }
                else if(j>2){
                    temp += inc2-4;
                }
                else{
                    temp += inc2;
                }
            }
            System.out.println();
            inc1 -= 2;
            if(i>=3){
                inc2 += 2;
            }
            
            
        }
    }
}
