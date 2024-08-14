public class MyName {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i < n; i++){             // H
            for(int j=0; j<n; j++){
                if(j==0 || j==n-1 || i==n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print(" ");
            
            
            for(int j=0; j<n; j++){             // I
                if(i==0 || i==n-1 || j==n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print(" ");
            
            
            for(int j=0; j<n; j++){             //T
                if(i==0 || j==n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print(" ");
            
            for(int j=0; j<n; j++){             //E
                if(j==0 || i==0 || i==n-1 || (i==n/2 && j<=n/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print(" ");
            
            for(int j=0; j<n; j++){             //N
                if(j==0 || i==j || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print(" ");
            
            for(int j=0; j<n; j++){             //D
                if(j==0 || ((i==0 || i==n-1) && j!=n-1 || (j==n-1 &&(i>0 && i<n-1)))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print(" ");
            
            for(int j=0; j<n; j++){             //R
                if(j==0 || ((i==0 || i==n/2) && j<n-1) || (j==n-1 && i>0 && i<n/2) || i-j==n/2-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print(" ");
            
            for(int j=0; j<n; j++){             //A
                if(((j==0 || j==n-1) && i!=0) || (i==0 && j!=0 && j!=n-1) || i==n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
            
        }
        
        
         
            
    }
}