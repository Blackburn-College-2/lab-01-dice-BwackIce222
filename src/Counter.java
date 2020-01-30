/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *The counter class keeps track of the the total rolls in an array.
 * Then calculates the probability
 * of achieving such roll.
 * 
 * @author montreal.thomas
 */
public class Counter {
    
 private double[] counterData;

    public double[] counter(int tests, int sides, int numOfDie) {
        counterData = new double[sides * numOfDie];
        Dice die = new Dice();

        for (int i = 0; i < tests; i++) {
            int instantSum = 0;
            for (int x = 0; x < numOfDie; x++) {
                instantSum = instantSum + die.roll(sides);
            }
            counterData[instantSum - 1] = counterData[instantSum - 1] + 1;
        }
        return counterData;
    }
}
