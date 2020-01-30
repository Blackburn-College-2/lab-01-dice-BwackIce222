

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author paul.kline/ montreal.thomas
 */
import java.util.Scanner;

public class Runner {

    /**
     * @param args Main method containing the
     * ABSTRACTED??? logic of the program.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfDie = 0;
        System.out.println("How many die would you like to use for "
                + "this simulation?");
        numOfDie = input.nextInt();
        System.out.println("How many instances of a die roll would you "
                + "like to simulate?");
        int tests = input.nextInt();
        System.out.println("How many sides will the die/dice have?");
        int sides = input.nextInt();
        Counter data = new Counter();
        double[] stats = data.counter(tests, sides, numOfDie);
        Roller roller = new Roller();
        roller.rollerProbabilities(stats, tests, sides, numOfDie);       

    }

}
