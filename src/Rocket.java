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
    final double weight;
    int cost;
    double maxWeight;
    double cargo;
    
    public Rocket(int weight){
        this.weight = weight;
    }
    
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
        if (item.getWeight() + this.weight + this.cargo <= this.maxWeight){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void carry(Item item) {
        this.cargo += item.getWeight();
    }
    
}
