import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static String getRandomElement(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    public static void main (String[] args) {
        int playerHP = 3;
        int enemyHP = 3;
        String rok = "rock";
        String ppr = "paper";
        String srs = "scissors";
        List<String> play = new ArrayList<>();
        play.add(rok);
        play.add(ppr);
        play.add(srs);

        while (playerHP > 0 && enemyHP > 0) {
            System.out.printf("Player Health: %d Computer Health: %d\n", playerHP, enemyHP);
            System.out.println("Rock Paper Scissors Shoot!\n");
            Scanner ask = new Scanner(System.in);
            String p = ask.nextLine(); // p is player choice
            System.out.println("Computer chose:");
            String c = getRandomElement(play); // c is computer choice
            System.out.println(c);

            //test answers vs each other and determine a victor
            if(c.equals(rok)) {
                if (p.equals(srs)) {
                    playerHP -= 1;
                } else if (p.equals(ppr)) {
                    enemyHP -= 1;
                }
            }
            if(c.equals(ppr)) {
                if (p.equals(rok)) {
                    playerHP -= 1;
                } else if (p.equals(srs)) {
                    enemyHP -= 1;
                }
            }
            if(c.equals(srs)) {
                if (p.equals(ppr)) {
                    playerHP -= 1;
                } else if (p.equals(rok)) {
                    enemyHP -= 1;
                }
            }
        }

        //once either the player or the computer has ran out of health we can declare a victor
        if (playerHP > 0) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins! Better luck next time.");
        }

    }
}
