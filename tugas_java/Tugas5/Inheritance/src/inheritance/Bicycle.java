/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Alfredo
 */
public class Bicycle {

    // the Bicycle class has three fields
    public int gear;
    public int speed;
    public String warna;
        
    // the Bicycle class has one constructor
    public Bicycle(int startSpeed, int startGear, String paint) {
        gear = startGear;
        speed = startSpeed;
        warna = paint;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    
    public void applyPaint(String newValue) {
        warna = newValue;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}
