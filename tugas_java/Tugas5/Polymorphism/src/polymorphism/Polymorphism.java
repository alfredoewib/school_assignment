/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Alfredo
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sepeda1, sepeda2, sepeda3;
        
        sepeda1 = new Bicycle(60, 5, "Hitam");
        sepeda2 = new MountainBike(40, 4, "Ungu", "Dual");
        sepeda3 = new RoadBike(75, 4, "Kekinian", 25);
        
        sepeda1.printDescription();
        sepeda2.printDescription();
        sepeda3.printDescription();
    }
    
}
