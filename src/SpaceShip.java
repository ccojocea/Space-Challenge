/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccojo
 */
public interface SpaceShip {
    //a method that returns either true or false indicating if the launch was successful or if the rocket has crashed.
    public boolean launch();
    //a method that also returns either true or false based on the success of the landing.
    public boolean land();
    //a method that takes an Item as an argument and returns true if the rocket can carry such item or false if it will exceed the weight limit.
    public boolean canCarry(Item item);
    //a method that also takes an Item object and updates the current weight of the rocket.
    public void carry(Item item);
}
