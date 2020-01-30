/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Roller class contains the logic required to print out the rolled
 * probabilities to the screen.
 * 
 * @author montreal.thomas
 */
public class Roller {
public void rollerProbabilities(double[] stats, double tests, double sides,
            int numOfDie) {
        System.out.println("After " + (int) tests + " rolls the distribution as"
                + " " + "a percentage is:");
        for (int i = 0; i < sides * numOfDie; i++) {
            double probability = stats[i] / tests * 100;
            System.out.printf((i + 1) + " was rolled " + (int) stats[i] + " "
                    + "times %.2f", probability);
            System.out.print("%");
            System.out.println("");

        }
    }
}
