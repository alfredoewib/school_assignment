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
public class BuildaBike {
    
    public static void main(String args[]) {
         MountainBike sepeda1 = new MountainBike(30, 80, 5, "kuning");
         System.out.println("Kecepatan : "+sepeda1.speed);
         System.out.println("Warna : "+sepeda1.warna+"Kmph");
         System.out.println("Gear : "+sepeda1.gear);
         System.out.println("Tinggi Sadel : "+sepeda1.seatHeight+"Cm");
         
    }
    
}
