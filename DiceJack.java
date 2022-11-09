package WorkBook4;

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int roll1 = initialDice();
        int roll2 = initialDice();
        int roll3 =initialDice();
        int computerRolls = roll1 + roll2 + roll3;
        System.out.println("Please type 3 differents numbers without commas.");
        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        int input3 = scan.nextInt();
        checkNumbers(input1, input2, input3);
        int humanRolls = input1+input2+input3;
        System.out.println("Rolls de l'ordinateur = " +computerRolls+ " Rolls de l'utilisateur = " +humanRolls);
        //checkWin(humanRolls, computerRolls);
        if (winCheck(humanRolls, computerRolls)) {
            System.out.println("You won");
        } else {
            System.out.println("It's over");
        }
        
scan.close();
    }

    public static int initialDice() {
        double x = (Math.random() * 6 + 1);
        return (int) x;
    }

    public static void checkNumbers(int input1, int input2, int input3) {
        if (input1 >= 7  || input2 >= 7  || input3 >= 7 ) {
            System.out.println("This game can't accept values excessing 6, sorry.");
            System.exit(0);
        } 
        if (input1 <= 0 || input2 <= 0 || input3 <= 0){
            System.out.println("This game can't accept values that are less than 1.");
        }
    }
    public static void checkWin(int humanRolls, int computerRolls) {
        if (humanRolls > computerRolls && humanRolls - computerRolls <= 3) {
            System.out.println("Human won, the world is safe now.");
        } else {
            System.out.println("Guess we all die now :/");
        }
    }

    public static boolean winCheck(int humanRolls, int computerRolls) {
        return (computerRolls < humanRolls && humanRolls - computerRolls < 3);
    }
}
