/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccojo
 */

//Rocket cost = $120 Million
//Rocket weight = 18 Tonnes
//Max weight (with cargo) = 29 Tonnes
//Chance of launch explosion = 4% * (cargo carried / cargo limit)
//Chance of landing crash = 8% * (cargo carried / cargo limit)
public class U2 extends Rocket{
    
    final static int U2WEIGHT = 18000;
    
    public U2(){
        super(U2WEIGHT);
        this.maxWeight = 29000;
        this.cost = 120000000;
    }
    
    @Override
    public boolean land(){
        double random = Math.random() * 100;
        double chanceOfFail = (8 * (this.cargo / this.maxWeight));
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
        double chanceOfFail = (4 * (this.cargo / this.maxWeight));
        System.out.println("Random land: " + random);
        System.out.println("chanceOfFail land: " + chanceOfFail);
        if (chanceOfFail >= random){
            return true;
        } else {
            return false;
        }
    }
}
