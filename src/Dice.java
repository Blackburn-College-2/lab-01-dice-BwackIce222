/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 *The Die class contains a method that simulates a random die roll of 'n' 
 * sides.
 */
public class Dice {
 private int sides;

    public int roll(int sides) {
        int roll = (int) (sides * Math.random() + 1);
        return roll;
    }  
    
    
}
