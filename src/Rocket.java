/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccojo
 */
public class Rocket implements SpaceShip{
    int weight;
    int cost;
    int maxWeight;
    int cargo;
    int cargoLimit = maxWeight - cargo;
    
    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        
    }

    @Override
    public void carry(Item item) {
        //to be implemented
    }
    
}
