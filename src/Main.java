
import java.io.File;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccojo
 */
public class Main {
    /**
     * 1 Create a Simulation object
     * 2 Load Items for Phase-1 and Phase-2
     * 3 Load a fleet of U1 rockets for Phase-1 and then for Phase-2
     * 4 Run the simulation using the fleet of U1 rockets and display the total budget required.
     * 5 Repeat the same for U2 rockets and display the total budget for that.
     * @param args 
     */
    
    static ArrayList<Item> phaseOneItems;
    static ArrayList<Item> phaseTwoItems;
    
    public static void main(String[] args) {
        Simulation sim = new Simulation();
        phaseOneItems = sim.loadItems(new File("src/phase-1.txt"));
        phaseTwoItems = sim.loadItems(new File("src/phase-2.txt"));
        ArrayList<Rocket> phaseOneU1 = sim.loadU1(phaseOneItems, 1);
        ArrayList<Rocket> phaseTwoU1 = sim.loadU1(phaseTwoItems, 2);
        ArrayList<Rocket> phaseOneU2 = sim.loadU2(phaseOneItems, 1);
        ArrayList<Rocket> phaseTwoU2 = sim.loadU2(phaseTwoItems, 2);
//        sim.runSimulation(phaseOneU1);
//        sim.runSimulation(phaseTwoU1);
//        sim.runSimulation(phaseOneU2);
//        sim.runSimulation(phaseTwoU2);
    }
}
