/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccojo
 */

//Rocket cost = $100 Million
//Rocket weight = 10 Tonnes
//Max weight (with cargo) = 18 Tonnes
//Chance of launch explosion = 5% * (cargo carried / cargo limit)
//Chance of landing crash = 1% * (cargo carried / cargo limit)
public class U1 extends Rocket{
    
    final static int U1WEIGHT = 10000;
    
    public U1(){
        super(U1WEIGHT);
        this.maxWeight = 18000;
        this.cost = 100000000;
    }
    
    @Override
    public boolean land(){
        double random = Math.random() * 100;
        double chanceOfFail = (1 * (this.cargo / this.maxWeight));
        System.out.println("Random land: " + random);
        System.out.println("chanceOfFail land: " + chanceOfFail);
        if (chanceOfFail >= random){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean launch(){
        double random = Math.random() * 100;
        double chanceOfFail = (5 * (this.cargo / this.maxWeight));
        System.out.println("Random land: " + random);
        System.out.println("chanceOfFail land: " + chanceOfFail);
        if (chanceOfFail >= random){
            return true;
        } else {
            return false;
        }
    }
}
