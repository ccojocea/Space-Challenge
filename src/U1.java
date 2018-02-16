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
    static int U1rockets = 0;
    public String type = "U1";
    
    public U1(){
        super(U1WEIGHT);
        this.maxWeight = 18000;
        this.cargoLimit = 8000;
        this.cost = 100000000;
        U1rockets++;
    }
    
    @Override
    public boolean land(){
        double random = Math.random() * 100;
        double chanceOfFail = (1 * (this.cargo / this.cargoLimit));
        if (chanceOfFail <= random){
            return true;
        } else {
            System.out.println("0. U1 Rocket failed to land");
            System.out.println("1. Landing random: " + random);
            System.out.println("2. Landing chance to fail: " + chanceOfFail);
            System.out.println("3. Rocket weight: " + this.weight);
            System.out.println("4. Rocket maxWeight: " + this.maxWeight);
            System.out.println("5. Rocket cargo: " + this.cargo);
            System.out.println("6. Rocket cargo limit: " + this.cargoLimit);
            return false;
        }
    }
    
    @Override
    public boolean launch(){
        double random = Math.random() * 100;
        double chanceOfFail = (5 * (this.cargo / this.cargoLimit));
        if (chanceOfFail <= random){
            return true;
        } else {
            System.out.println("0. U1 Rocket failed to launch");
            System.out.println("1. Launch random: " + random);
            System.out.println("2. Launch chance to fail: " + chanceOfFail);
            System.out.println("3. Rocket weight: " + this.weight);
            System.out.println("4. Rocket maxWeight: " + this.maxWeight);
            System.out.println("5. Rocket cargo: " + this.cargo);
            System.out.println("6. Rocket cargo limit: " + this.cargoLimit);
            return false;
        }
    }
}
