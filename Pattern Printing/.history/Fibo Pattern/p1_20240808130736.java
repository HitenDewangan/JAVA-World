// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class p1 {
    public static void main(String[] args) {
        int count = 1;
        for(int i=1; i<=3; i++){
            int sum = 0;
            int temp = count;
            if(i==1){
                System.out.println();
            }
            for(int j=1; j < 2*i-1 ; j++){
                sum += count;
                count += 2;
            }
            
            for(int j=1; j<=2*i-1; j++){
                if(i==j){
                    System.out.print(sum);
                }
                else{
                    System.out.print(temp);
                    temp += 2;
                }
            }
            System.out.println();
        }
    }
}