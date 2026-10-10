class p2 {
    public static void main(String[] args) {
        int count = 1;
        for(int i=1; i<=3; i++){
            int sum = 0, temp = count;
            for(int j=1; j<2*i-1; j++){
                sum+=count;
                count+=2;
            }
            for(int j=1; j<=2*i-1; j++){
                if(i==j){
                    System.out.print(sum);
                }
                else{
                    System.out.print(temp);
                    temp+=2;
                }
                System.out.print(" ");  
            }
            System.out.println();
        }
    }
}
