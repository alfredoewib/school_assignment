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
public class RoadBike extends Bicycle{
    // In millimeters (mm)
    private int tireWidth;

    public RoadBike(int startSpeed,
                    int startGear,
                    String warna,
                    int newTireWidth){
        super(startSpeed,
              startGear,
              warna);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth(){
      return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth){
        this.tireWidth = newTireWidth;
    }
    
    public String getWarna() {
        return this.warna;
    }
 
    public void printDescription(){
        super.printDescription();
        System.out.println("The RoadBike" + " with " + getWarna() + " color " + " has " + getTireWidth() +
            " MM tires.");
    }
}
