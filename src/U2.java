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
    static int U2rockets = 0;
    public String type = "U2";
    
    public U2(){
        super(U2WEIGHT);
        this.maxWeight = 29000;
        this.cargoLimit = 11000;
        this.cost = 120000000;
        U2rockets++;
    }
    
    @Override
    public boolean land(){
        double random = Math.random() * 100;
        double chanceOfFail = (8 * (this.cargo / this.cargoLimit));
        if (chanceOfFail <= random){
            return true;
        } else {
            System.out.println("0. U2 Rocket failed to land");
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
        double chanceOfFail = (4 * (this.cargo / this.cargoLimit));
        if (chanceOfFail <= random){
            return true;
        } else {
            System.out.println("0. U2 Rocket failed to launch");
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
