/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masking;

/**
 *
 * @author Alfredo
 */
public class Masking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String account = "1234567898765432";
        System.out.println("account: " + account);

        System.out.println("Masked number examples:");

        //  mask all bust last 4 numbers
        System.out.println(maskNumber(account, "xxxxxxxxxxxx####"));

        //  insert dashes
        System.out.println(maskNumber(account, "####-####-####-####"));

        //  insert dashes and mask all but last 4 numbers
        System.out.println(maskNumber(account, "xxxx-xxxx-xxxx-####"));
    }
    
    public static String maskNumber(String number, String mask) {
 
      int index = 0;
      StringBuilder masked = new StringBuilder();
      for (int i = 0; i < mask.length(); i++) {
         char c = mask.charAt(i);
         if (c == '#') {
            masked.append(number.charAt(index));
            index++;
         } else if (c == 'x') {
            masked.append(c);
            index++;
         } else {
            masked.append(c);
         }
      }
      return masked.toString();
   }
    
}
