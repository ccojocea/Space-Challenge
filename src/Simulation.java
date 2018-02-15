
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeArray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccojo
 */
public class Simulation {
    /**
     * this method loads all items from a text file and returns an ArrayList of Items:
     * Each line in the text file consists of the item name followed by = then its weigh in kg. For example:
     * habitat=100000
     * colony=50000
     * food=50000
     * loadItems should read the text file line by line and create an Item object for 
     * each and then add it to an ArrayList of Items. 
     * The method should then return that ArrayList.
     * @param file
     * @return 
     */
    public ArrayList<Item> loadItems(File file){
        ArrayList<Item> list = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                String[] lineSplit = line.split("=");
                System.out.println("Loading item: " + lineSplit[0] + " - Weight: " + lineSplit[1]);
                list.add(new Item(lineSplit[0], Integer.valueOf(lineSplit[1])));
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found!" + e);
        }
        return list;
    }
    
    
    /**
     * this method takes the ArrayList of Items returned from loadItems and starts creating U1 rockets. 
     * It first tries to fill up 1 rocket with as many items as possible before creating a new rocket object 
     * and filling that one until all items are loaded. The method then returns the ArrayList of those U1 
     * rockets that are fully loaded.
     * @param arrayList 
     */
    public ArrayList<Rocket> loadU1(ArrayList<Item> arrayList){
        ArrayList<Rocket> u1Rockets = new ArrayList<>();
        u1Rockets.add(new U1());
        int rocketCounter = 0;
        for(int i = 0; i < arrayList.size(); i++){
            if(u1Rockets.get(rocketCounter).canCarry(arrayList.get(i))){
                u1Rockets.get(rocketCounter).carry(arrayList.get(i));
            } else {
                u1Rockets.add(new U1());
                rocketCounter++;
                u1Rockets.get(rocketCounter).carry(arrayList.get(i));
            }
        }
        return u1Rockets;
    }
    
    /**
     * this method also takes the ArrayList of Items and starts creating U2 rockets and filling them 
     * with those items the same way as with U1 until all items are loaded. The method then returns the 
     * ArrayList of those U2 rockets that are fully loaded.
     * @param arrayList 
     */
    public ArrayList<Rocket> loadU2(ArrayList<Item> arrayList){
        ArrayList<Rocket> u2Rockets = new ArrayList<>();
        u2Rockets.add(new U2());
        int rocketCounter = 0;
        for(int i = 0; i < arrayList.size(); i++){
            if(u2Rockets.get(rocketCounter).canCarry(arrayList.get(i))){
                u2Rockets.get(rocketCounter).carry(arrayList.get(i));
            } else {
                u2Rockets.add(new U2());
                rocketCounter++;
                u2Rockets.get(rocketCounter).carry(arrayList.get(i));
            }
        }
        System.out.println("U2 rockets created initially: " + (rocketCounter + 1));
        return u2Rockets;
    }
    
    /**
     * this method takes an ArrayList of Rockets and calls launch and land methods for each of the 
     * rockets in the ArrayList. Every time a rocket explodes or crashes (i.e if launch or land return false) 
     * it will have to send that rocket again. All while keeping track of the total budget required to send each rocket safely to Mars. 
     * @param arrayList 
     * @return runSimulation then returns the total budget required to send all rockets (including the crashed ones).
     */
    public long runSimulation(ArrayList<Rocket> arrayList){
        int counter = 0;
        for(Rocket rocket : arrayList){
            counter++;
            while(rocket.launch() == false){
                System.out.println("Rocket failed to launch: " + counter);
                counter++;
            }
            while(rocket.land() == false){
                System.out.println("Rocket failed to land: " + counter);
                counter++;
            }
        }
        return counter * arrayList.get(0).cost;
    }
}
