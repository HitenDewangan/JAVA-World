import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectingNumFromGuesser();
        u.collectingNumFromPlayers();
        u.comparing();
    }
}

class Guesser{
    int gnum;

    int guessingNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser, please guess the number: ");
        gnum = sc.nextInt();
        return gnum;
        
    }
}

class Players{
    int pnum;

    int predictingNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player, please predict a number: ");
        pnum = sc.nextInt();
        return pnum;
    }
}

class Umpire{

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectingNumFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNum();
    }

    void collectingNumFromPlayers(){
        Players p1 = new Players();
        numFromPlayer1 = p1.predictingNum();
        Players p2 = new Players();
        numFromPlayer2 = p2.predictingNum();
        Players p3 = new Players();
        numFromPlayer3 = p3.predictingNum();
    }

    void comparing(){
        if(numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3){
            System.out.println("All players won the game");
        }
        else if(numFromGuesser == numFromPlayer1){
            System.out.println("Player 1 won the game");
        }
        else if(numFromGuesser == numFromPlayer2){
            System.out.println("Player 2 won the game");
        }
        else if(numFromGuesser == numFromPlayer3){
            System.out.println("Player 3 won the game");
        }
        else{
            System.out.println("No one won the game !");
        }
    }
}