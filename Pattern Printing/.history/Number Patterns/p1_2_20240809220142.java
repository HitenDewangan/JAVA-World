// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class p1_2 {
    public static void main(String[] args) {
        int count = 1;
        for(int i=1; i<=4; i++){
            int sum = 0;
            int temp = count;

            for(int k=2; k<= (5-i+1); k++){
                System.out.print(" ");
            }

            if(i==1){
                System.out.println(i);
                count += 2;
            }
            else{
                for(int j=1; j < 2*i-1 ; j++){
                    sum += count;
                    count += 2;
                }
                
                for(int j=1; j<=2*i-1; j++){
                    if(i==j){
                        System.out.print(sum+" ");
                    }
                    else{
                        System.out.print(temp+"");
                        temp += 2;
                    }
                }
                System.out.println();
            }
            
        }
    }
}