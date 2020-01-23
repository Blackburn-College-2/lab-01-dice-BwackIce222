/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author montreal.thomas
 */
public class Dice {
private int side;    
    

public int Roll(){
 int roll= (int)(6*Math.random()+1);
 return roll;         
}    
    
    
}
