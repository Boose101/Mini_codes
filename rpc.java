import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
public class rpc {
    private static Random random = new Random();
    public static void main(String[] args) {
        String[] options = {"Rock", "Paper", "Scissors"};
        Scanner scan = new Scanner(System.in);
        System.out.print("Rock(0), Paper (1), Scissors (2): ");
        int op = scan.nextInt();
        scan.close();
        int cop = random.nextInt(2);
        try{
        System.out.println("You played " + options[op] + ". The computer played " + options[cop] + ".");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dont be stupid");
        }
        if(op == cop){
            System.out.println("Its a draw!");
        }
        else if(op == 0){
            if(cop == 1){
                System.out.println("You lose!");
            }else{
                System.out.println("You win!");
            }
        }
        else if(op == 1){
            if(cop == 0){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
        }
        else if(op == 1){
            if(cop == 0){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
        }
        else if(op == 2){
            if(cop == 1){
                System.out.println("You lose!");
            }
            else{
                System.out.println("You win!");
            }
        }

    }
}
